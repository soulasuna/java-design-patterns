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

import com.gin.gof.design.patterns.iterator.composite.BaseMenuComposite;

/**
 * <p>
 * Description: 菜单菜品子项
 * </p>
 * ClassName: MenuItem
 *
 * @author dnt
 * @version V1.0.0
 * @date 2020/6/9、15:09
 * @since jdk1.8
 */
public class MenuItem{
    /**
     * 菜名
     */
    private String name;
    /**
     * 子项
     */
    private Integer price;

    public MenuItem(String name, Integer price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "MenuItem{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
