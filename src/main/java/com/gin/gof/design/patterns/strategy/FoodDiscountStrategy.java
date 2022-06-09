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

/**
 * <p>
 * Description: 食品产品折扣策略
 * </p>
 * ClassName: FoodDiscountStrategy
 *
 * @author dnt
 * @version V1.0.0
 * @date 2020/5/28、17:39
 * @since jdk1.8
 */
public class FoodDiscountStrategy implements DiscountStrategy {
    @Override
    public void productDiscount(Product product) {
        Integer price = product.getPrice();
        price = (price / 10) * 8;
        product.setPrice(price);
    }
}