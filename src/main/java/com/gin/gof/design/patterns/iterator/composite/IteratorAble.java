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
package com.gin.gof.design.patterns.iterator.composite;

/**
 * <p>
 * Description: 迭代器能力接口
 * </p>
 * InterfaceName: IteratorAble
 *
 * @author dnt
 * @version V1.0.0
 * @date 2020/6/10、9:54
 * @since jdk1.8
 */
public interface IteratorAble<T> {
    /**
     * 创建迭代器
     * @return  返回对应的迭代器
     */
    IteratorAble<T> createIterator();
    /**
     * 下一个元素是否存在
     * @return  存在返回true
     */
    boolean hasNext();

    /**
     * 获得下一个元素对象
     * @return  下一个元素对象
     */
    T next();
}
