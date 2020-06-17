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
 * Description: 客户端
 * </p>
 * ClassName: Client
 *
 * @author dnt
 * @version V1.0.0
 * @date 2020/4/22、14:22
 * @since jdk1.8
 */
public class Client {
    public static void main(String[] args) {
        SpeakAble wuKong = new WuKong("孙悟空");
        // 孙悟空变身老虎喊话
        SpeakAble tigerDecorator = new TigerDecorator(wuKong);
        String tigerSpeakContent = tigerDecorator.speak();
        System.out.println(tigerSpeakContent);

        // 孙悟空变身妖怪喊话
        SpeakAble monsterDecorator = new MonsterDecorator(wuKong);
        String monsterSpeakContent = monsterDecorator.speak();
        System.out.println(monsterSpeakContent);

        // 孙悟空变身老虎和妖怪喊话
        SpeakAble monsterTigerDecorator = new MonsterDecorator(new TigerDecorator(wuKong));
        String monsterTigerSpeakContent = monsterTigerDecorator.speak();
        System.out.println(monsterTigerSpeakContent);
    }
}