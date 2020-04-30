/*
 * Copyright 2013-2018 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.gin.gof.design.patterns.proxy.dynamic.factory;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.util.Assert;

import java.lang.reflect.Proxy;

/**
 * <p>
 * Description: 代理工厂(生产代理对象的工厂)
 * </p>
 * ClassName: ProxyFactory
 *
 * @author dnt
 * @version V1.0.0
 * @date 2020/4/30、9:56
 * @since jdk1.8
 */
public class ProxyFactory {
    /**
     * <p>
     * Description: 获得代理对象
     * </p>
     *
     * @param target 被代理对象
     * @param advice 增强织入代码
     * @param <T>    被代理对象的类型泛型
     * @return 代理对象
     * @author dnt
     * @date 2020/4/30 14:12
     */
    @SuppressWarnings("unchecked")
    public static <T> T getProxy(T target, Advice advice) {
        Assert.notNull(target, "error : proxy target can not be null");
        Assert.notNull(advice, "error : proxy advice can not be null");
        T proxyBean = null;
        Class<?> targetClass = target.getClass();
        // 没有实现接口的情况,使用cglib
        if (0 == targetClass.getInterfaces().length) {
            System.out.println("使用cglib生产代理类");
            Enhancer enhancer = new Enhancer();
            enhancer.setSuperclass(targetClass);
            MethodInterceptor methodInterceptor =
                    (object, method, args, methodProxy) -> {
                        Object result = null;
                        try {
                            advice.beforeExecute(args);
                            result = methodProxy.invokeSuper(object, args);
                            advice.afterExecute(args, result);
                            return result;
                        } catch (Throwable t) {
                            advice.exceptionExecute(t, args);
                        } finally {
                            advice.afterReturnExecute(args);
                        }
                        return result;
                    };
            enhancer.setCallback(methodInterceptor);
            proxyBean = (T) enhancer.create();
        }
        // 使用接口的情况使用jdk实现动态代理
        else {
            System.out.println("使用jdk的proxy生产代理类");
            proxyBean = (T) Proxy.newProxyInstance(
                    targetClass.getClassLoader(),
                    targetClass.getInterfaces(),
                    (proxy, method, args) -> {
                        Object result = null;
                        try {
                            advice.beforeExecute(args);
                            result = method.invoke(target, args);
                            advice.afterExecute(args, result);
                            return result;
                        } catch (Throwable t) {
                            advice.exceptionExecute(t, args);
                        } finally {
                            advice.afterReturnExecute(args);
                        }
                        return result;
                    });
        }
        return proxyBean;
    }
}
