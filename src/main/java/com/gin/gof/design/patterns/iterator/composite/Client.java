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
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * Description: 迭代器模式配合组合模式
 * </p>
 * ClassName: Client
 *
 * @author dnt
 * @version V1.0.0
 * @date 2020/6/10、9:24
 * @since jdk1.8
 */
public class Client {
    public static void main(String[] args) {
        // 初始化服务员
        Waiter waiter = createWaiter();
        // 打印每个账单
        waiter.showAllMenu();
    }


    /**
     * 初始化服务员对象
     * @return
     */
    private static Waiter createWaiter() {
        BaseMenuComposite menuComposite = initMenuComposite();
        return new Waiter("rose", menuComposite );
    }

    private static BaseMenuComposite initMenuComposite() {
        List<BaseMenuComposite> menuCompositeList = new ArrayList<>();
        // 早餐列表
        BaseMenuComposite[] breakfastMenus = {
                new MenuItem("油条",2),
                new MenuItem("豆浆",8),
                new MenuItem("茶叶蛋",3)
        };

        BaseMenuComposite breakfastMenu = new BreakfastMenu("营养早餐",breakfastMenus);
        menuCompositeList.add(breakfastMenu);

        // 午餐列表
        List<BaseMenuComposite> lunchMenuList = new ArrayList<>();
        lunchMenuList.add(new MenuItem("鱼香肉丝盖饭",20));
        lunchMenuList.add(new MenuItem("红烧牛肉面",25));
        lunchMenuList.add(new MenuItem("紫菜鸡蛋汤",10));

        BaseMenuComposite lunchMenu = new LunchMenu("营养午餐",lunchMenuList);
        menuCompositeList.add(lunchMenu);

        // 晚餐列表
        Map<String,BaseMenuComposite> dinnerMenuMap = new LinkedHashMap<>(16);
        dinnerMenuMap.put("麻辣小龙虾",new MenuItem("麻辣小龙虾",89));
        dinnerMenuMap.put("烤羊肉串",new MenuItem("烤羊肉串",5));
        dinnerMenuMap.put("原浆啤酒",new MenuItem("原浆啤酒",60));
        // 晚餐中又包含甜点列表
        List<BaseMenuComposite> dessertMenuList = new ArrayList<>();
        dessertMenuList.add(new MenuItem("卡其布诺蛋糕",39));
        dessertMenuList.add(new MenuItem("巧克力抹茶蛋糕",39));
        dessertMenuList.add(new MenuItem("草莓布丁蛋糕",29));
        dinnerMenuMap.put("美味甜点",new DessertMenu("美味甜点",dessertMenuList));

        BaseMenuComposite dinnerMenu = new DinnerMenu("美味晚餐",dinnerMenuMap);
        menuCompositeList.add(dinnerMenu);

        return new MenuAggregateRoot("本店菜单", menuCompositeList);
    }
}
