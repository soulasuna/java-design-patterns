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
package com.gin.gof.design.patterns.facade;

/**
 * <p>
 * Description: 客户端
 * </p>
 * ClassName: Client
 *
 * @author dnt
 * @version V1.0.0
 * @date 2020/4/23、11:19
 * @since jdk1.8
 */
public class Client {

    private static FinancingFacade FINANCING_FACADE = null;

    static {
        FINANCING_FACADE = new FinancingFacade(
                new DebentureServer() {
                    @Override
                    public void buy(Integer money) {
                        System.out.println("购买"+money+"债券");
                    }

                    @Override
                    public Integer sell() {
                        System.out.println("卖出债券获得60元");
                        return 60;
                    }
                },
                new SharesServer() {
                    @Override
                    public void buy(Integer money) {
                        System.out.println("购买"+money+"股票");
                    }

                    @Override
                    public Integer sell() {
                        System.out.println("卖出股票获得70元");
                        return 70;
                    }
                }
        );
    }
    /**
     * 客户端不需要知道具体的细节,只需要关心自己有关的信息即可.
     * 符合设计原则的迪米特法则(最少知道原则)
     *
     * 这个已理财这个事情举例
     */
    public static void main(String[] args) {
        // 购买理财
        FINANCING_FACADE.buy(100);
        // 卖出基金获得收益
        Integer sell = FINANCING_FACADE.sell();
        System.out.println("卖出理财产品获得"+sell+"元");

    }
}
