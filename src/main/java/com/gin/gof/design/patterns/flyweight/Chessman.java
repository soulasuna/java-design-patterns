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
package com.gin.gof.design.patterns.flyweight;

/**
 * <p>
 * Description: 棋子
 * </p>
 * ClassName: Chessman
 *
 * @author dnt
 * @version V1.0.0
 * @date 2020/4/23、18:44
 * @since jdk1.8
 */
public class Chessman {
    /**
     * 棋子的颜色
     */
    private String color;
    public Chessman(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Chessman{" +
                "color='" + color + '\'' +
                '}';
    }
}
