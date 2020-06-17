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
 * Description: 实现单例模式的最佳方案——单元素枚举类型
 * </p>
 * EnumName: SingletonEnum
 *
 * @author dnt
 * @version V1.0.0
 * @date 2020/6/11、10:29
 * @since jdk1.8
 */
public enum SingletonEnum {
    /**
     * 单利对象
     */
    SINGLETON;
}
