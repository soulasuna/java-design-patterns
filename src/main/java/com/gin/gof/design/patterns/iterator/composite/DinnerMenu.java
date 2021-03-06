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

import com.gin.gof.design.patterns.iterator.MenuItem;

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
public class DinnerMenu extends BaseMenuComposite{
    private Map<String,BaseMenuComposite> menuCompositeMap;
    private Iterator<BaseMenuComposite> iterator;
    public DinnerMenu(String name, Map<String,BaseMenuComposite> menuCompositeMap) {
        super();
        initDinnerMenu(name,menuCompositeMap);
    }

    private void initDinnerMenu(String name, Map<String, BaseMenuComposite> menuCompositeMap) {
        this.name = name;
        this.menuCompositeMap = menuCompositeMap;
        this.iterator = menuCompositeMap.values().iterator();
    }

    @Override
    public void addChild(BaseMenuComposite baseMenuComposite) {

    }

    @Override
    public IteratorAble<BaseMenuComposite> createIterator() {
        return this;
    }

    @Override
    public boolean hasNext() {
        return iterator.hasNext();
    }

    @Override
    public BaseMenuComposite next() {
        return iterator.next();
    }
}
