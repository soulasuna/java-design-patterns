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
package com.gin.gof.design.patterns.template;

/**
 * <p>
 * Description: 烧茄子做法实现
 * </p>
 * ClassName: BurnedEggplantCooking
 *
 * @author dnt
 * @version V1.0.0
 * @date 2020/5/27、15:49
 * @since jdk1.8
 */
public class BurnedEggplantCooking extends BaseVegetableCooking {

    @Override
    protected void cleanIngredient() {
        System.out.println("去除茄子皮,清洗干净.");
    }

    /**
     * 茄子需要预处理
     * @return  返回true
     */
    @Override
    protected boolean isNeedPretreatment() {
        return true;
    }

    @Override
    protected void pretreatmentIngredient() {
        System.out.println("六层油温下锅炸茄子,变色以后倒出控油");
    }

    @Override
    protected void ingredientsCooking() {
        System.out.println("烹饪烧茄子");
    }

    @Override
    protected void ingredientsSeasoning() {
        System.out.println("加盐,加糖调味");
    }
}
