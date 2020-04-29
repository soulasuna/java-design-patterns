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
package com.gin.gof.design.patterns.proxy.dynamic.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * <p>
 * Description: 客户端
 * </p>
 * ClassName: Client
 *
 * @author dnt
 * @version V1.0.0
 * @date 2020/4/29、15:39
 * @since jdk1.8
 */
public class Client {
    /**
     * 动态代理实现打印日志
     */
    public static void main(String[] args) {
        ConversionData conversionData =
                createProxy(new ConversionDataImpl(),new LogProxyAdvice());
        String outPut = conversionData.StringUpCaseFormat("aaa");
        System.out.println(outPut);
    }

    /**
     * 获得对象的代理类
     * @param conversionData    实现被代理接口的对象实现 {@link ConversionData}
     * @param advice            代理策略接口实现对象 {@link ProxyAdviceAble}
     * @return                  对象的代理对象
     */
    private static ConversionData createProxy(ConversionData conversionData, ProxyAdviceAble advice) {
        return (ConversionData) Proxy.newProxyInstance(conversionData.getClass().getClassLoader(),
                conversionData.getClass().getInterfaces(),
                (proxy, method, args) -> {
                    Object result = null;
                    try {
                        advice.beforeExecute(args);
                        System.out.println("执行完成");
                        result = method.invoke(conversionData, args);
                        advice.afterExecute(new Object[]{result});
                        return result;
                    }catch (Throwable t){
                        advice.exceptionExecute(t);
                    }finally {
                        advice.afterReturnExecute();
                    }
                    return result;
                });
    }
}
