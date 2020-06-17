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
 * Description: 已经付款等待确认
 * </p>
 * ClassName: ForSaleStatus
 *
 * @author dnt
 * @version V1.0.0
 * @date 2020/6/4、16:18
 * @since jdk1.8
 */
public class ForSaleStatus implements StatusAble {
    private VendingMachine vendingMachine;
    public ForSaleStatus(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }
    @Override
    public String pay(Integer money) {
        return "商品付款已完成,无需重复购买";
    }

    @Override
    public String sell() {
        // 库存减一
        BlockingQueue<Product> productStock = vendingMachine.getProductStock();
        try {
            Product take = productStock.take();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // 判断库存是否为空
        StatusAble temp = productStock.size() == 0 ?
                vendingMachine.getSoldOutNoPayStatus()
                : vendingMachine.getNoPayStatus();
        vendingMachine.setStatus(temp);
        return "商品已售出,请在商品出口取走商品";
    }

    @Override
    public String replenishment(List<Product> productList) {
        return "商品还有库存,无需添加库存";
    }
}
