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
 * Description: 商品售尽,未付款
 * </p>
 * ClassName: SoldOutNoPayStatus
 *
 * @author dnt
 * @version V1.0.0
 * @date 2020/6/4、17:52
 * @since jdk1.8
 */
public class SoldOutNoPayStatus implements StatusAble {
    private VendingMachine vendingMachine;
    public SoldOutNoPayStatus(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public String pay(Integer money) {
        vendingMachine.setStatus(vendingMachine.getSoldOutForSaleStatus());
        return "商品已经售尽,请点击按钮获得获取退款";
    }

    @Override
    public String sell() {

        return "商品已经售尽,请联系管理员补货";
    }

    @Override
    public String replenishment(List<Product> productList) {
        BlockingQueue<Product> productStock = vendingMachine.getProductStock();
        productStock.addAll(productList);
        vendingMachine.setStatus(vendingMachine.getNoPayStatus());
        return "商品库存已更新,请先付账然后购买";
    }
}
