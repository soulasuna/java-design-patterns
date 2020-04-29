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

import java.util.Arrays;

/**
 * <p>
 * Description: 日志打印切面实现
 * </p>
 * ClassName: LogProxyAdvice
 *
 * @author dnt
 * @version V1.0.0
 * @date 2020/4/29、16:08
 * @since jdk1.8
 */
public class LogProxyAdvice implements ProxyAdviceAble{
    @Override
    public Object beforeExecute(Object[] args) {
        System.out.println("日志打印,方法入参: " + Arrays.toString(args));
        return args;
    }
    @Override
    public Object afterExecute(Object[] args) {
        System.out.println("日志打印,方法出参: " + Arrays.toString(args));
        return args;
    }
    @Override
    public void exceptionExecute(Throwable throwable) {
        String message = throwable.getCause().getMessage();
        System.out.println("日志打印,方法执行错误,错误信息: " + message);
    }
    @Override
    public void afterReturnExecute() {
        System.out.println("日志打印,返回参数以后");
    }
}
