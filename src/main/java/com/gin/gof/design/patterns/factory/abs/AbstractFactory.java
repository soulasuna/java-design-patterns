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
 * Description: 抽象工厂类
 * </p>
 * InterfaceName: AbstractFactory
 *
 * @author dnt
 * @version V1.0.0
 * @date 2020/4/13、14:31
 * @since jdk1.8
 */
public interface AbstractFactory {
    /**
     * <p>
     * Description: 获得苹果的方法
     * </p>
     * @return      苹果实例 {@link BaseApple}
     *
     * @author dnt
     * @date 2020/4/13 14:37
     */
    BaseApple getApple();
    /**
     * <p>
     * Description: 获得香蕉的方法
     * </p>
     * @return      香蕉实例 {@link BaseBanana}
     *
     * @author dnt
     * @date 2020/4/13 14:38
     */
    BaseBanana getBanana();
}
