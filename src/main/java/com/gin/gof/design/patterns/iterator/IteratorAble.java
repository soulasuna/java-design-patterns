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
package com.gin.gof.design.patterns.iterator;

/**
 * <p>
 * Description: 迭代器统一接口
 * </p>
 * InterfaceName: IteratorAble
 *
 * @author dnt
 * @version V1.0.0
 * @date 2020/6/9、14:08
 * @since jdk1.8
 */
public interface IteratorAble<T extends MenuItem> {
    /**
     * 创建一个迭代器
     * @return
     */
    IteratorAble<T> createIterator();
    /**
     * 是否包含下一个元素
     * @return  包含返回true
     */
    boolean hasNext();
    /**
     * 获得下一个元素
     * @return 一个元素
     */
    T next();
}
