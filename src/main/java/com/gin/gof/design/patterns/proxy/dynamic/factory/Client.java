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

/**
 * <p>
 * Description: 客户端
 * </p>
 * ClassName: Client
 *
 * @author dnt
 * @version V1.0.0
 * @date 2020/4/30、9:43
 * @since jdk1.8
 */
public class Client {
    /**
     * 使用简单工厂实现获得代理对象
     */
    public static void main(String[] args) {
        // 实现接口方式
        ConversionData conversion = new ConversionDataImpl();
        ConversionData proxy =
                ProxyFactory.getProxy(conversion, new LogProxyAdvice());
        proxy.stringToUpCase("aa");


        // 没有实现接口方式
        ConversionString conversion1 = new ConversionString();
        ConversionString proxy1 =
                ProxyFactory.getProxy(conversion1, new LogProxyAdvice());
        proxy.stringToUpCase("aa");
    }
}
