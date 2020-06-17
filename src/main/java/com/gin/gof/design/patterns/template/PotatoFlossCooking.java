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

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

/**
 * <p>
 * Description: 炒土豆丝
 * </p>
 * ClassName: PotatoFlossCooking
 *
 * @author dnt
 * @version V1.0.0
 * @date 2020/5/27、16:17
 * @since jdk1.8
 */
public class PotatoFlossCooking extends BaseVegetableCooking {
    @Override
    protected void cleanIngredient() {
        System.out.println("土豆丝去皮切丝,清洗干净,加入少许白醋");
    }

    /**
     * 土豆丝不需要对食材预处理
     * @return
     */
    @Override
    protected boolean isNeedPretreatment() {
        return false;
    }

    @Override
    protected void pretreatmentIngredient() {
        throw new NotImplementedException();
    }

    @Override
    protected void ingredientsCooking() {
        System.out.println("热油爆炒3分钟");
    }

    @Override
    protected void ingredientsSeasoning() {
        System.out.println("加盐鸡精,加白醋");
    }
}
