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

import java.util.Arrays;

/**
 * <p>
 * Description: 日志打印操作织入代码实现
 * </p>
 * ClassName: LogProxyAdvice
 *
 * @author dnt
 * @version V1.0.0
 * @date 2020/4/30、13:48
 * @since jdk1.8
 */
public class LogProxyAdvice implements Advice {
    /**
     * 打印入参
     *
     * @param args 被代理方法参数列表
     * @return 返回null
     */
    @Override
    public Object beforeExecute(Object[] args) {
        System.out.println("====方法请求开始====入参: " + Arrays.toString(args));
        return null;
    }

    /**
     * 打印出参
     *
     * @param args   被代理方法参数列表
     * @param result 被代理方法执行返回值
     * @return 返回null
     */
    @Override
    public Object afterExecute(Object[] args, Object result) {
        System.out.println("====方法执行完成====出参: " + result);
        return null;
    }

    /**
     * 错误日志打印
     *
     * @param throwable 执行方法抛出异常
     * @param args      被代理方法参数列表
     */
    @Override
    public void exceptionExecute(Throwable throwable, Object[] args) {
        System.out.println("====方法执行异常====异常信息: " + throwable.getCause().getMessage());
    }

    /**
     * 参数返回后,相应操作
     *
     * @param args 被代理方法参数列表
     */
    @Override
    public void afterReturnExecute(Object[] args) {
        System.out.println("====参数返回完成====后续处理====");
    }
}
