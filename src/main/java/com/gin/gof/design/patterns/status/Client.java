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
package com.gin.gof.design.patterns.status;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * Description: 客户端
 * </p>
 * ClassName: Client
 *
 * @author dnt
 * @version V1.0.0
 * @date 2020/6/3、16:03
 * @since jdk1.8
 */
public class Client {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine(createProductList());
        // 初始化完成
        System.out.println("机器初始化,第一次买饮料~~");
        System.out.println(vendingMachine.pay(20));
        System.out.println(vendingMachine.sell());
        // 持续的交易
        for (int i = 0; i < 9; i++) {
            System.out.println("第" + i + "次买饮料~~");
            System.out.println(vendingMachine.pay(20));
            System.out.println(vendingMachine.sell());
        }
        // 收货机没有货物的情况
        System.out.println("商品售尽以后付款~~~");
        System.out.println(vendingMachine.pay(20));
        System.out.println("点击按钮获得退款~~~");
        System.out.println(vendingMachine.sell());

        // 自动销售机补货
        System.out.println("商品售尽补货~~~");
        Product product = new Product("礼物魔盒", 20);
        List<Product> productList = new ArrayList<>(1);
        productList.add(product);
        System.out.println(vendingMachine.replenishment(productList));
        // 商品补货完成
        System.out.println("商品补货以后付款~~~");
        System.out.println(vendingMachine.pay(20));
        System.out.println("商品补货以后购买~~~");
        System.out.println(vendingMachine.sell());
    }

    private static List<Product> createProductList(){
        Product product = new Product("礼物魔盒",20);
        List<Product> productList = new ArrayList<>(10);
        Product temp;
        for (int i = 0; i < 10; i++) {
            try {
                temp = (Product) product.clone();
                productList.add(temp);
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
        }
        return productList;
    }
}
