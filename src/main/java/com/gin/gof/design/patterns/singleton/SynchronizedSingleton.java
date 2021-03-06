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
package com.gin.gof.design.patterns.singleton;

/**
 * <p>
 * Description: 调用时检验实例是否存在,存在返回,不存在创建然后返回
 * </p>
 * ClassName: SynchronizedSingleton
 *
 * @author dnt
 * @version V1.0.0
 * @date 2020/6/11、10:27
 * @since jdk1.8
 */
public class SynchronizedSingleton {
    private volatile static SynchronizedSingleton INSTANCE;
    /**
     * 私有构造函数
     */
    private SynchronizedSingleton() {
    }
    /**
     * 提供静态的获得实例的方法
     */
    public static SynchronizedSingleton getInstance(){
        if (INSTANCE == null){
            synchronized (SynchronizedSingleton.class){
                if(INSTANCE == null){
                    INSTANCE = new SynchronizedSingleton();
                }
            }
        }
        return INSTANCE;
    }
}
