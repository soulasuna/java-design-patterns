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
 * Description: 早餐菜单
 * </p>
 * ClassName: BreakfastMenu
 *
 * @author dnt
 * @version V1.0.0
 * @date 2020/6/9、11:13
 * @since jdk1.8
 */
public class BreakfastMenu implements IteratorAble<MenuItem> {
    /**
     * 菜单的总数量
     */
    private Integer menuMaxLength;
    /**
     * 当前访问元素的下标
     */
    private Integer stepIndex;
    /**
     * 菜单集合
     */
    private MenuItem [] menuItems;
    public BreakfastMenu(MenuItem[] menuItems) {
        super();
        initBreakfastMenu(menuItems);
    }

    /**
     * 初始化对象
     * @param menuItems 菜单列表
     */
    private void initBreakfastMenu(MenuItem[] menuItems) {
        menuMaxLength = menuItems.length;
        stepIndex = 0;
        this.menuItems = menuItems;
    }

    /**
     * 返回对象的迭代器
     * @return  对象的迭代器对象
     */
    @Override
    public IteratorAble<MenuItem> createIterator() {
        return this;
    }

    /**
     * 返回是否包含有下一个元素
     * @return  下一个元素存在true
     */
    @Override
    public boolean hasNext() {
        return stepIndex < menuMaxLength;
    }
    /**
     * 返回当前元素
     * @return  返回当前元对象
     */
    @Override
    public MenuItem next() {
        MenuItem menuItem = menuItems[stepIndex];
        stepIndex ++;
        return menuItem;
    }
}
