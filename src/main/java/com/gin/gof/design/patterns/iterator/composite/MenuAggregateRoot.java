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

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * <p>
 * Description: 菜单聚合根
 * </p>
 * ClassName: MenuAggregateRoot
 *
 * @author dnt
 * @version V1.0.0
 * @date 2020/6/10、16:19
 * @since jdk1.8
 */
public class MenuAggregateRoot extends BaseMenuComposite{
    private List<BaseMenuComposite> menuCompositeList = new ArrayList<>();
    private Iterator<BaseMenuComposite> iterator;

    public MenuAggregateRoot(String name, List<BaseMenuComposite> menuCompositeList) {
        super();
        initMenuAggregateRoot(name, menuCompositeList);
        this.menuCompositeList = menuCompositeList;
    }

    private void initMenuAggregateRoot(String name, List<BaseMenuComposite> menuCompositeList) {
        this.name = name;
        this.menuCompositeList = menuCompositeList;
        this.iterator = menuCompositeList.iterator();
    }

    @Override
    public void addChild(BaseMenuComposite menuComposite) {
        menuCompositeList.add(menuComposite);
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
