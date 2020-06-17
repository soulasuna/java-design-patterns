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
package com.gin.gof.design.patterns.decorator;

/**
 * <p>
 * Description: 妖怪能力实现
 * </p>
 * ClassName: MonsterDecorator
 *
 * @author dnt
 * @version V1.0.0
 * @date 2020/4/22、16:18
 * @since jdk1.8
 */
public class MonsterDecorator extends BaseStatusDecorator {
    public MonsterDecorator(SpeakAble speaker) {
        super(speaker);
    }
    /**
     * 妖怪喊话能力
     * @return  喊话内容
     */
    @Override
    public String speak() {
        return this.speaker.speak() + "变身:" + "我具有了妖怪的能力,我感觉我又行了";
    }
}
