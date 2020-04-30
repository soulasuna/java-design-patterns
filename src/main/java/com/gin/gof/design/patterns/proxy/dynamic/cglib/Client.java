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
package com.gin.gof.design.patterns.proxy.dynamic.cglib;

import com.gin.gof.design.patterns.proxy.dynamic.jdk.ConversionData;
import com.gin.gof.design.patterns.proxy.dynamic.jdk.LogProxyAdvice;
import com.gin.gof.design.patterns.proxy.dynamic.jdk.ProxyAdviceAble;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * <p>
 * Description: 客户端
 * </p>
 * ClassName: Client
 *
 * @author dnt
 * @version V1.0.0
 * @date 2020/4/29、16:42
 * @since jdk1.8
 */
public class Client {
    public static void main(String[] args) {
        ConversionData conversionData =
                createProxy(ConversionData.class,new LogProxyAdvice());
        String outPut = conversionData.StringUpCaseFormat("bbb");
        System.out.println(outPut);
    }

    /**
     * 获得对象的代理类
     * @param clazz     实现被代理接口的对象实现 {@link ConversionData}
     * @param advice    代理策略接口实现对象 {@link ProxyAdviceAble}
     * @return          对象的代理对象
     */
    private static ConversionData createProxy(Class<?> clazz, ProxyAdviceAble advice) {

        // 创建Enhancer对象，类似于JDK动态代理的Proxy类
        Enhancer enhancer = new Enhancer();
        // 设置目标类的字节码文件
        enhancer.setSuperclass(clazz);
        // 设置增强流程
        enhancer.setCallback(
                (MethodInterceptor) (object, method, args, methodProxy) -> {
                    Object result = null;
                    try {
                        advice.beforeExecute(args);
                        result = methodProxy.invokeSuper(object, args);
                        advice.afterExecute(new Object[]{result});
                        return result;
                    }catch (Throwable t){
                        advice.exceptionExecute(t);
                    }finally {
                        advice.afterReturnExecute();
                    }
                    return result;
                });
        return (ConversionData) enhancer.create();
    }


}
