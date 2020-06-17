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
 * Description: 菜品子项
 * </p>
 * ClassName: MenuItem
 *
 * @author dnt
 * @version V1.0.0
 * @date 2020/6/10、14:13
 * @since jdk1.8
 */
public class MenuItem extends BaseMenuComposite {
    /**
     * 菜单金额
     */
    private Integer price;
    public MenuItem(String name, Integer price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "MenuItem{" +
                "price=" + price +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public void addChild(BaseMenuComposite menuComposite) {
    }

    @Override
    public IteratorAble<BaseMenuComposite> createIterator() {
        return null;
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public BaseMenuComposite next() {
        return null;
    }
}
