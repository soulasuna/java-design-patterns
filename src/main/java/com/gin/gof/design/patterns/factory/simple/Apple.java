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
 * Description: 苹果实现类
 * </p>
 * ClassName: Apple
 *
 * @author dnt
 * @version V1.0.0
 * @date 2020/4/13、11:07
 * @since jdk1.8
 */
public class Apple extends BaseFruit {
    /**
     * <p>
     * Description: 苹果显示
     * </p>
     *
     * @author dnt
     * @date 2020/4/13 11:10
     */
    @Override
    protected void show() {
        System.out.println("一个红苹果");
    }
}
