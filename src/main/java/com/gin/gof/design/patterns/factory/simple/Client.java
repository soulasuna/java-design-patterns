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
package com.gin.gof.design.patterns.factory.simple;

/**
 * <p>
 * Description: 客户端
 * </p>
 * ClassName: Client
 *
 * @author dnt
 * @version V1.0.0
 * @date 2020/4/13、10:53
 * @since jdk1.8
 */
public class Client {
    /**
     * 工厂类一般我们会通过读取配置文件,项目启动时就会加载
     */
    private static SimpleFactory<BaseFruit> FACTORY = FruitFactory.getInstance();

    public static void main(String[] args) {
        // 这里可以是参数也可以是配置文件中读取
        String name = "apple";
        BaseFruit fruit = FACTORY.getProduct("apple");
        fruit.show();
    }
}
