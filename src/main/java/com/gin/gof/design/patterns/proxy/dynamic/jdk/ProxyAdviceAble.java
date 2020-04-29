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

/**
 * <p>
 * Description: 代理增强方法接口
 * </p>
 * InterfaceName: ProxyAdviceAble
 *
 * @author dnt
 * @version V1.0.0
 * @date 2020/4/29、15:57
 * @since jdk1.8
 */
public interface ProxyAdviceAble {
    /**
     * 执行方法前执行方法
     * @param args  入参
     * @return      出参
     */
    Object beforeExecute(Object[] args);
    /**
     * 执行方法后执行方法
     * @param args  入参
     * @return      出参
     */
    Object afterExecute(Object[] args);
    /**
     * 执行方法报错后执行方法
     * @param throwable 异常对象
     */
    void exceptionExecute(Throwable throwable);
    /**
     * 执行方法返回参数参数以后执行方法
     */
    void afterReturnExecute();
}
