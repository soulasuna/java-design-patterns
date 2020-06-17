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
 * Description: 状态模式能力
 * </p>
 * InterfaceName: StatusAble
 *
 * @author dnt
 * @version V1.0.0
 * @date 2020/6/3、17:06
 * @since jdk1.8
 */
public interface StatusAble {
    /**
     * 输入金额
     * @param money 输入钱
     * @return      提示标语
     */
    String pay(Integer money);
    /**
     * 售卖产品
     * @return  提示标语
     */
    String sell();
    /**
     * 补充商品
     * @param productList   补货商品列表
     * @return              提示标语
     */
    String replenishment(List<Product> productList);
}
