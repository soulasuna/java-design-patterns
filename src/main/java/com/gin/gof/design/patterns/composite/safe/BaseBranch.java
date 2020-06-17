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
package com.gin.gof.design.patterns.composite.safe;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * Description: 树枝节点
 * </p>
 * ClassName: BaseBranch
 *
 * @author dnt
 * @version V1.0.0
 * @date 2020/4/26、17:03
 * @since jdk1.8
 */
public abstract class BaseBranch implements CompositeAble{
    /**
     * 项目总价
     */
    protected BigDecimal price;
    /**
     * 叶子节点
     */
    protected List<CompositeAble> itemList = new ArrayList<>();
    /**
     * 计算总价
     * @return  商品总价
     */
    @Override
    public BigDecimal calculatePrice() {
        BigDecimal result = new BigDecimal("0.00");
        if (itemList.isEmpty()){
            return result;
        }
        // 计算每个子节点的总价相加;
        for (CompositeAble item : itemList) {
            result = result.add(item.calculatePrice());
        }
        return result;
    }
    /**
     * 添加子项
     */
    protected void addChild(CompositeAble compositeAble){
        itemList.add(compositeAble);
    }
}

