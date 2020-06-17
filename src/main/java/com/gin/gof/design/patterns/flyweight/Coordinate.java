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
 * Description: 棋子的坐标
 * </p>
 * ClassName: Coordinate
 *
 * @author dnt
 * @version V1.0.0
 * @date 2020/4/23、18:34
 * @since jdk1.8
 */
public class Coordinate {
    /**
     * x坐标
     */
    private Integer x;
    /**
     * y坐标
     */
    private Integer y;
    public Coordinate(Integer x, Integer y) {
        this.x = x;
        this.y = y;
    }
    @Override
    public String toString() {
        return "Coordinate{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}