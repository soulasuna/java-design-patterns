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
import java.util.concurrent.BlockingQueue;

/**
 * <p>
 * Description: 商品售尽,已付款
 * </p>
 * ClassName: SoldOutForSaleStatus
 *
 * @author dnt
 * @version V1.0.0
 * @date 2020/6/4、18:00
 * @since jdk1.8
 */
public class SoldOutForSaleStatus implements StatusAble {
    private VendingMachine vendingMachine;
    public SoldOutForSaleStatus(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public String pay(Integer money) {
        return "商品已经售尽,请点击按钮获取退款";
    }

    @Override
    public String sell() {
        vendingMachine.setStatus(vendingMachine.getSoldOutNoPayStatus());
        return "商品已经售尽,请在取货窗口获得退款";
    }

    @Override
    public String replenishment(List<Product> productList) {
        BlockingQueue<Product> productStock = vendingMachine.getProductStock();
        productStock.addAll(productList);
        vendingMachine.setStatus(vendingMachine.getForSaleStatus());
        return "商品库存已更新,请点击按钮获得售出货物";
    }
}
