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
 * Description: 股票服务抽象层
 * </p>
 * InterfaceName: SharesServer
 *
 * @author dnt
 * @version V1.0.0
 * @date 2020/4/23、11:36
 * @since jdk1.8
 */
public interface SharesServer {
    /**
     * 买入股票产品
     */
    void buy(Integer money);
    /**
     * 卖出股票产品
     */
    Integer sell();
}
