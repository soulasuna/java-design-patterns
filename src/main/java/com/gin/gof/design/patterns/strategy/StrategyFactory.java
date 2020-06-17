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
 * Description: 策略工厂
 * </p>
 * ClassName: StrategyFactory
 *
 * @author dnt
 * @version V1.0.0
 * @date 2020/5/28、17:14
 * @since jdk1.8
 */
public class StrategyFactory {

    /**
     * 根据商品类型获得打折策略
     */
    public static DiscountStrategy getDiscountStrategy(Product product){
        String type = product.getType();
        if ("DIGITAL".equals(type)){
            return new DigitalDiscountStrategy();
        }
        // 服装商品5折
        else if ("CLOTHING".equals(type)){
            return new ClothingDiscountStrategy();
        }
        // 食品打8折
        else if ("FOOD".equals(type)){
            return new FoodDiscountStrategy();
        }
        else {
            throw new RuntimeException();
        }
    }
}
