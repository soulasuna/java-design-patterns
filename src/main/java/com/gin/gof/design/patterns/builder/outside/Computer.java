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
package com.gin.gof.design.patterns.builder.outside;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

/**
 * <p>
 * Description: 电脑
 * </p>
 * ClassName: Computer
 *
 * @author dnt
 * @version V1.0.0
 * @date 2020/4/16、15:34
 * @since jdk1.8
 */
public class Computer implements Serializable {
    /**
     * 每个零部件就算是商品
     */
    private List<BaseModule> products = new LinkedList<>();

    public List<BaseModule> getProducts() {
        return products;
    }

    public void setProducts(List<BaseModule> products) {
        this.products = products;
    }

    public String show(){
        final StringBuilder sb = new StringBuilder();
        products.forEach((product) -> {
            sb.append("型号:").append(product.code)
                    .append("价格:").append(product.price)
                    .append(";");
        });
        return sb.toString();
    }
}

