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
package com.gin.gof.design.patterns.template;

/**
 * <p>
 * Description: 客户端
 * </p>
 * ClassName: Client
 *
 * @author dnt
 * @version V1.0.0
 * @date 2020/5/27、16:29
 * @since jdk1.8
 */
public class Client {
    public static void main(String[] args) {
        CookingAble cooking;
        // 烹饪烧烧茄子
        cooking = new BurnedEggplantCooking();
        cooking.cook();

        // 烹饪炒土豆丝
        cooking = new PotatoFlossCooking();
        cooking.cook();
        
        System.out.println("test-pick");
    }
}
