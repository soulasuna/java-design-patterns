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
package com.gin.gof.design.patterns.factory.abs;

/**
 * <p>
 * Description: 国产水果工厂类
 * </p>
 * ClassName: InternalFruitFactory
 *
 * @author dnt
 * @version V1.0.0
 * @date 2020/4/13、14:42
 * @since jdk1.8
 */
public class InternalFruitFactory implements AbstractFactory {
    /**
     * <p>
     * Description: 获得国产苹果
     * </p>
     * @param
     * @return
     *
     * @author dnt
     * @date 2020/4/13 15:30
     */
    @Override
    public BaseApple getApple() {
        return new InternalApple();
    }
    /**
     * <p>
     * Description: 获得国产香蕉
     * </p>
     * @param
     * @return
     *
     * @author dnt
     * @date 2020/4/13 15:30
     */
    @Override
    public BaseBanana getBanana() {
        return new InternalBanana();
    }
}
