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
package com.gin.gof.design.patterns.factory.simple;

/**
 * <p>
 * Description: 水果工厂类
 * </p>
 * ClassName: FruitFactory
 *
 * @author dnt
 * @version V1.0.0
 * @date 2020/4/13、11:06
 * @since jdk1.8
 */
public final class FruitFactory implements SimpleFactory<BaseFruit> {
    private static FruitFactory FACTORY = new FruitFactory();
    private FruitFactory() {
    }

    public static FruitFactory getInstance(){
        return FACTORY;
    }
    @Override
    public BaseFruit getProduct(String name) {
        if (FruitTypeEnum.APPLE.getName().equals(name)){
            return new Apple();
        }else if (FruitTypeEnum.BANANA.getName().equals(name)) {
            return new Banana();
        }else {
            return null;
        }
    }
    /**
     * <p>
     * Description: 水果名称枚举类
     * </p>
     * ClassName: FruitFactory
     *
     * @author dnt
     * @version v1.0.0
     * @date 2020/4/13 11:28
     */
    enum FruitTypeEnum{
        /**
         * 苹果
         */
        APPLE("apple"),
        /**
         * 香蕉
         */
        BANANA("banana");
        private String name;
        FruitTypeEnum(String name) {
            this.name = name;
        }
        public String getName() {
            return name;
        }
    }
}
