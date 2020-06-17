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
package com.gin.gof.design.patterns.composite.safe;

import java.math.BigDecimal;

/**
 * <p>
 * Description: 客户端
 * </p>
 * ClassName: Client
 *
 * @author dnt
 * @version V1.0.0
 * @date 2020/4/24、10:59
 * @since jdk1.8
 */
public class Client {
    /**
     * 订单显示详情,订单计算总计
     */
    public static void main(String[] args) {
        // 整个订单
        BaseBranch shoppingTrolley = new ShoppingTrolley();

        // 永辉超市的商品
        BaseBranch yongHuiMerchant = new Merchant("永辉超市");
        yongHuiMerchant.addChild(new Product("苹果",new BigDecimal("9.00")));
        yongHuiMerchant.addChild(new Product("香蕉",new BigDecimal("8.00")));

        // 物美超市的商品
        BaseBranch wuMeiMerchant = new Merchant("物美超市");
        wuMeiMerchant.addChild(new Product("牛肉",new BigDecimal("49.00")));
        wuMeiMerchant.addChild(new Product("猪肉",new BigDecimal("80.00")));

        // 添加到主菜单
        shoppingTrolley.addChild(yongHuiMerchant);
        shoppingTrolley.addChild(wuMeiMerchant);

        // 展示商品,计算总价,
        shoppingTrolley.show();
        BigDecimal total = shoppingTrolley.calculatePrice();
        System.out.println("====总价:"+total+"元");

        System.out.println("====子列表====");
        // 永辉超市
        yongHuiMerchant.show();
        BigDecimal yongHui = yongHuiMerchant.calculatePrice();
        System.out.println("====永辉总价:"+yongHui+"元");

        System.out.println("====子列表====");
        // 物美超市
        wuMeiMerchant.show();
        BigDecimal wuMei = wuMeiMerchant.calculatePrice();
        System.out.println("====物美总价:"+wuMei+"元");
    }
}
