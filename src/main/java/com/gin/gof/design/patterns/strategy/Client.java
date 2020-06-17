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
package com.gin.gof.design.patterns.strategy;

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
 * @date 2020/5/28、16:32
 * @since jdk1.8
 */
public class Client {
    public static void main(String[] args) {
        // 购买商品列表
        List<Product> productList = new ArrayList<>();

        Product applePhone = new Product("01","DIGITAL","苹果手机",1000);
        Product trousers = new Product("02","CLOTHING","裤子",100);
        Product banana = new Product("03","FOOD","香蕉",10);

        productList.add(applePhone);
        productList.add(trousers);
        productList.add(banana);

        // 结算
        settlement(productList);
        // 显示
        for (Product product: productList) {
            System.out.println("商品折扣以后" + product);
        }
    }

    /**
     * 商品结算(进行打折处理)
     */
    private static void settlement(List<Product> productList){
        DiscountStrategy discountStrategy = null;
        for (Product product: productList) {
            // 根据商品类型
            discountStrategy = StrategyFactory.getDiscountStrategy(product);
            discountStrategy.productDiscount(product);
        }
    }

}
