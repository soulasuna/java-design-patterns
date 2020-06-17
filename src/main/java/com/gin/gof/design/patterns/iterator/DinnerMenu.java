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

import java.util.Iterator;
import java.util.Map;

/**
 * <p>
 * Description: 晚餐菜单
 * </p>
 * ClassName: DinnerMenu
 *
 * @author dnt
 * @version V1.0.0
 * @date 2020/6/9、13:40
 * @since jdk1.8
 */
public class DinnerMenu implements IteratorAble<MenuItem> {
    private Map<String,MenuItem> itemMap;
    private Iterator<MenuItem> iterator;
    public DinnerMenu(Map<String, MenuItem> itemMap) {
        this.itemMap = itemMap;
        this.iterator = itemMap.values().iterator();

    }
    @Override
    public IteratorAble<MenuItem> createIterator() {
        return this;
    }

    @Override
    public boolean hasNext() {
        return iterator.hasNext();
    }

    @Override
    public MenuItem next() {
        return iterator.next();
    }
}
