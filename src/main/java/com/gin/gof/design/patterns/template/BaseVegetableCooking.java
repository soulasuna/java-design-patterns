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
 * Description: 蔬菜烹饪抽象类
 * </p>
 * ClassName: BaseVegetableCooking
 *
 * @author dnt
 * @version V1.0.0
 * @date 2020/5/27、14:35
 * @since jdk1.8
 */
public abstract class BaseVegetableCooking implements CookingAble {
    /**
     * 做饭
     */
    @Override
    public final void cook() {
        // 清洗食材
        this.cleanIngredient();
        // 判断是否需要与处理,预处理食材
        if(this.isNeedPretreatment()){
            this.pretreatmentIngredient();
        }
        // 烹饪食材
        this.ingredientsCooking();
        // 食材调味
        this.ingredientsSeasoning();
        // 出锅装盘
        this.finishCooking();
    }

    /**
     * 烹饪完毕
     */
    private void finishCooking(){
        System.out.println("食材处理完毕,出锅装盘");
    }

    /**
     * 清理食材
     */
    protected abstract void cleanIngredient();

    /**
     * 食材是否需要预处理
     * @return 需要预先处理返回true,不需要返回false
     */
    protected abstract boolean isNeedPretreatment();

    /**
     * 与处理食材
     */
    protected abstract void pretreatmentIngredient();

    /**
     * 烹饪食材
     */
    protected abstract void ingredientsCooking();

    /**
     * 食材调味
     */
    protected abstract void ingredientsSeasoning();

}
