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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * Description: 客户端
 * </p>
 * ClassName: Client
 *
 * @author dnt
 * @version V1.0.0
 * @date 2020/6/8、14:27
 * @since jdk1.8
 */
public class Client {
    /**
     * 服务员访问全部菜单
     */
    public static void main(String[] args) {
        // 初始化服务员
        Waiter waiter = createWaiter();
        // 打印每个账单
        waiter.showAllMenu();
    }

    /**
     * 初始化服务员
     */
    private static Waiter createWaiter() {
        List<IteratorAble<MenuItem>> menuList = new ArrayList<>();

        // 早餐
        MenuItem[] menuItems = {
                new MenuItem("油条",2),
                new MenuItem("豆浆",8),
                new MenuItem("茶叶蛋",3)
        };
        BreakfastMenu breakfastMenu = new BreakfastMenu(menuItems);
        menuList.add(breakfastMenu);

        // 午餐
        List<MenuItem> productList = new ArrayList<>();
        productList.add(new MenuItem("鱼香肉丝盖饭",20));
        productList.add(new MenuItem("红烧牛肉面",25));
        productList.add(new MenuItem("紫菜鸡蛋汤",10));

        LunchMenu lunchMenu = new LunchMenu(productList);
        menuList.add(lunchMenu);

        // 晚餐
        Map<String, MenuItem> itemMap = new HashMap<>(16);
        itemMap.put("麻辣小龙虾",new MenuItem("麻辣小龙虾",89));
        itemMap.put("烤羊肉串",new MenuItem("烤羊肉串",5));
        itemMap.put("原浆啤酒",new MenuItem("原浆啤酒",60));

        DinnerMenu dinnerMenu = new DinnerMenu(itemMap);
        menuList.add(dinnerMenu);

        return new Waiter(menuList);

    }

}
