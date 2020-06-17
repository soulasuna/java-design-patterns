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
 * Description: 美的智能音响
 * </p>
 * ClassName: MideaVideo
 *
 * @author dnt
 * @version V1.0.0
 * @date 2020/6/2、18:15
 * @since jdk1.8
 */
public class MideaVideo extends BaseVideo {
    @Override
    protected void on() {
        System.out.println("美的智能音响 打开...");
    }

    @Override
    protected void off() {
        System.out.println("美的智能音响 打开...");
    }

    @Override
    protected void up() {
        System.out.println("美的智能音响 音量调高...");
    }

    @Override
    protected void down() {
        System.out.println("美的智能音响 音量调底...");
    }
}
