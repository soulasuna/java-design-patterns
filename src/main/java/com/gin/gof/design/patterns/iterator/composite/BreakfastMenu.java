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
 * Description: 早餐菜单
 * </p>
 * ClassName: BreakfastMenu
 *
 * @author dnt
 * @version V1.0.0
 * @date 2020/6/9、11:13
 * @since jdk1.8
 */
public class BreakfastMenu extends BaseMenuComposite{
    private BaseMenuComposite [] menuComposites;
    private Integer maxSize;
    private Integer step;
    public BreakfastMenu(String name, BaseMenuComposite[] menuComposites) {
        initBreakfastMenu(name,menuComposites);
    }

    private void initBreakfastMenu(String name, BaseMenuComposite[] menuComposites) {
        this.name = name;
        this.maxSize = menuComposites.length;
        this.step = 0;
        this.menuComposites = menuComposites;
    }

    @Override
    public void addChild(BaseMenuComposite menuComposite) {
        // 数组扩容 添加最后一个元素
    }

    @Override
    public IteratorAble<BaseMenuComposite> createIterator() {
        return this;
    }

    @Override
    public boolean hasNext() {
        return this.step < this.maxSize;
    }

    @Override
    public BaseMenuComposite next() {
        BaseMenuComposite menuComposite = menuComposites[step];
        step ++;
        return menuComposite;
    }
}
