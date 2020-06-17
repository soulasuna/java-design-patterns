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
package com.gin.gof.design.patterns.status;

import java.util.List;

/**
 * <p>
 * Description: 有库存没有付款状态
 * </p>
 * ClassName: NoPayStatus
 *
 * @author dnt
 * @version V1.0.0
 * @date 2020/6/4、16:05
 * @since jdk1.8
 */
public class NoPayStatus implements StatusAble {
    private VendingMachine vendingMachine;
    public NoPayStatus(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    /**
     * 付款
     * 改变状态,响应信息
     * @param money 输入钱
     * @return
     */
    @Override
    public String pay(Integer money) {
        vendingMachine.setStatus(vendingMachine.getForSaleStatus());
        return "商品付款已完成,请点击按钮购买";
    }

    @Override
    public String sell() {
        return "商品未付款完成,请先进行付款操作";
    }

    @Override
    public String replenishment(List<Product> productList) {
        return "商品还有库存,无需添加库存";
    }
}
