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
 * Description: 织入代码接口
 * </p>
 * ClassName: Advice
 *
 * @author dnt
 * @version V1.0.0
 * @date 2020/4/30、10:25
 * @since jdk1.8
 */
public interface Advice {
    /**
     * <p>
     * Description: 方法执行前织入代码
     * </p>
     *
     * @param args 被代理方法参数列表
     * @return 执行返回结果, 无返回值返回null即可
     * @author dnt
     * @date 2020/4/30 10:34
     */
    Object beforeExecute(Object[] args);

    /**
     * <p>
     * Description: 方法执行后织入代码
     * </p>
     *
     * @param args   被代理方法参数列表
     * @param result 被代理方法执行返回值
     * @return 执行返回结果, 无返回值返回null即可
     * @author dnt
     * @date 2020/4/30 10:38
     */
    Object afterExecute(Object[] args, Object result);

    /**
     * <p>
     * Description: 方法执行异常时织入代码
     * </p>
     *
     * @param throwable 执行方法抛出异常
     * @param args      被代理方法参数列表
     * @author dnt
     * @date 2020/4/30 11:01
     */
    void exceptionExecute(Throwable throwable, Object[] args);

    /**
     * <p>
     * Description: 方法返回值后织入代码
     * </p>
     *
     * @param args 被代理方法参数列表
     * @author dnt
     * @date 2020/4/30 11:03
     */
    void afterReturnExecute(Object[] args);


}
