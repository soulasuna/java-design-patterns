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
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * <p>
 * Description: 自动售卖机
 * </p>
 * ClassName: VendingMachine
 *
 * @author dnt
 * @version V1.0.0
 * @date 2020/6/3、17:04
 * @since jdk1.8
 */
public class VendingMachine implements StatusAble{
    /**
     * 有库存还没有付款
     */
    private NoPayStatus noPayStatus;
    /**
     * 有库存已经付款
     */
    private ForSaleStatus forSaleStatus;
    /**
     * 没有库存没有付款
     */
    private SoldOutNoPayStatus soldOutNoPayStatus;

    /**
     * 没有库存已经付款
     */
    private SoldOutForSaleStatus soldOutForSaleStatus;
    /**
     * 库存商品
     */
    private BlockingQueue<Product> productStock = new ArrayBlockingQueue<>(100);
    /**
     * 自动售卖机的状态
     */
    private StatusAble status;

    @Override
    public String pay(Integer money) {
        return status.pay(money);
    }
    @Override
    public String sell() {
        return status.sell();
    }
    @Override
    public String replenishment(List<Product> productList) {
        return status.replenishment(productList);
    }
    /**
     * 初始化
     * @param productList
     */
    public VendingMachine(List<Product> productList) {
        initVendingMachine(productList);
    }
    /**
     * 初始化自动售卖机
     * @param productList   自动售卖机
     */
    private void initVendingMachine(List<Product> productList) {
        // 初始化全部的状态
        noPayStatus = new NoPayStatus(this);
        forSaleStatus = new ForSaleStatus(this);
        soldOutNoPayStatus = new SoldOutNoPayStatus(this);
        soldOutForSaleStatus = new SoldOutForSaleStatus(this);
        // 初始化参数
        if (productList == null || productList.isEmpty()){
            status = soldOutNoPayStatus;
        }else{
            productStock.addAll(productList);
            status = noPayStatus;
        }
    }

    public NoPayStatus getNoPayStatus() {
        return noPayStatus;
    }

    public void setNoPayStatus(NoPayStatus noPayStatus) {
        this.noPayStatus = noPayStatus;
    }

    public ForSaleStatus getForSaleStatus() {
        return forSaleStatus;
    }

    public void setForSaleStatus(ForSaleStatus forSaleStatus) {
        this.forSaleStatus = forSaleStatus;
    }

    public SoldOutNoPayStatus getSoldOutNoPayStatus() {
        return soldOutNoPayStatus;
    }

    public void setSoldOutNoPayStatus(SoldOutNoPayStatus soldOutNoPayStatus) {
        this.soldOutNoPayStatus = soldOutNoPayStatus;
    }

    public SoldOutForSaleStatus getSoldOutForSaleStatus() {
        return soldOutForSaleStatus;
    }

    public void setSoldOutForSaleStatus(SoldOutForSaleStatus soldOutForSaleStatus) {
        this.soldOutForSaleStatus = soldOutForSaleStatus;
    }

    public BlockingQueue<Product> getProductStock() {
        return productStock;
    }

    public void setProductStock(BlockingQueue<Product> productStock) {
        this.productStock = productStock;
    }

    public StatusAble getStatus() {
        return status;
    }

    public void setStatus(StatusAble status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "VendingMachine{" +
                "noPayStatus=" + noPayStatus +
                ", forSaleStatus=" + forSaleStatus +
                ", soldOutNoPayStatus=" + soldOutNoPayStatus +
                ", soldOutForSaleStatus=" + soldOutForSaleStatus +
                ", productStock=" + productStock +
                ", status=" + status +
                '}';
    }
}
