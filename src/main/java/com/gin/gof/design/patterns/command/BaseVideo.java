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
package com.gin.gof.design.patterns.command;

/**
 * <p>
 * Description: 音响基本类
 * </p>
 * ClassName: BaseVideo
 *
 * @author dnt
 * @version V1.0.0
 * @date 2020/6/2、17:56
 * @since jdk1.8
 */
public abstract class BaseVideo {
    /**
     * 打开
     */
    protected abstract void on();
    /**
     * 关闭
     */
    protected abstract void off();
    /**
     * 提升亮度
     */
    protected abstract void up();
    /**
     * 降低亮度
     */
    protected abstract void down();


}
