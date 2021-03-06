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

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * Description: 服务员
 * </p>
 * ClassName: Waiter
 *
 * @author dnt
 * @version V1.0.0
 * @date 2020/6/9、13:48
 * @since jdk1.8
 */
public class Waiter {
    private List<IteratorAble<MenuItem>> menuList = new ArrayList<>();
    public Waiter(List<IteratorAble<MenuItem>> menuList) {
        this.menuList = menuList;
    }

    /**
     * 添加新的菜单
     * @param menus 菜单列表
     */
    public void addMenus(IteratorAble<MenuItem> menus){
        menuList.add(menus);
    }

    public void showAllMenu(){
        for (IteratorAble<MenuItem> menuIterator : menuList) {
            showAllMenuItem(menuIterator);
        }
    }
    private void showAllMenuItem(IteratorAble<MenuItem> menuIterator) {
        while (menuIterator.hasNext()){
            MenuItem next = menuIterator.next();
            System.out.println(next);
        }
    }
}
