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
package com.gin.gof.design.patterns.prototype.deep;

/**
 * <p>
 * Description: 客户端
 * </p>
 * ClassName: Client
 *
 * @author dnt
 * @version V1.0.0
 * @date 2020/4/20、14:28
 * @since jdk1.8
 */
public class Client {
    public static void main(String[] args) {
        Sheep sheep = new Sheep(1,"aa",1,new Sheep(11,"AA",2,null));
        Sheep clone = (Sheep)sheep.clone();

        // 实现对象深拷贝,打印结果false
        System.err.println(sheep == clone);
        // 实现对象深拷贝,打印结果false
        System.err.println(sheep.getFather() == clone.getFather());
    
        System.out.println("test pick");
    }
}
