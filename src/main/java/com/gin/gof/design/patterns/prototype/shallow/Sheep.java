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
package com.gin.gof.design.patterns.prototype.shallow;

import java.io.Serializable;

/**
 * <p>
 * Description: 克隆绵阳
 * </p>
 * ClassName: Sheep
 *
 * @author dnt
 * @version V1.0.0
 * @date 2020/4/20、14:29
 * @since jdk1.8
 */
public class Sheep implements Serializable,Cloneable {
    /**
     * 编号
     */
    private Integer id;
    /**
     * 名字
     */
    private String name;
    /**
     * 年龄
     */
    private Integer age;
    public Sheep(Integer id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    /**
     * 实现 Cloneable 接口, 重写Object的clone()方法
     * @return      返回对象
     */
    @Override
    protected Object clone() {
        try{
            return super.clone();
        }catch (Exception e) {
        }
        return null;
    }
}
