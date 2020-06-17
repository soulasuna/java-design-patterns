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
package com.gin.gof.design.patterns.strategy;

import java.io.Serializable;

/**
 * <p>
 * Description: 产品类
 * </p>
 * ClassName: Product
 *
 * @author dnt
 * @version V1.0.0
 * @date 2020/5/28、17:00
 * @since jdk1.8
 */
public class Product implements Serializable {
    /**
     * 商品编码
     */
    private String code;
    /**
     * 商品类型
     */
    private String type;
    /**
     * 商品名称
     */
    private String name;
    /**
     * 商品价格
     */
    private Integer price;

    public Product(String code, String type, String name, Integer price) {
        this.code = code;
        this.type = type;
        this.name = name;
        this.price = price;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "BaseProduct{" +
                "code='" + code + '\'' +
                ", type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }


}
