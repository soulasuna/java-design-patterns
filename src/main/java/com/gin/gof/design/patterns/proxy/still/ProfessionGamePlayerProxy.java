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
package com.gin.gof.design.patterns.proxy.still;

/**
 * <p>
 * Description: 专业代练(代理类实现)
 * </p>
 * ClassName: ProfessionGamePlayerProxy
 *
 * @author dnt
 * @version V1.0.0
 * @date 2020/4/28、17:01
 * @since jdk1.8
 */
public class ProfessionGamePlayerProxy implements GamePlayerAble {
    private GamePlayerAble gamePlayerAble;
    public ProfessionGamePlayerProxy(GamePlayerAble gamePlayerAble) {
        this.gamePlayerAble = gamePlayerAble;
    }

    /**
     * 登录账号
     */
    @Override
    public void logIn() {
        System.out.println("高级代练AAA开始登录账号");
        gamePlayerAble.logIn();
    }

    /**
     * 打怪升级
     */
    @Override
    public void play() {
        System.out.println("高级代练AAA开始效率升级");
        gamePlayerAble.play();
        System.out.println("高级代练今天升级5级");
    }

    /**
     * 代练完成
     */
    @Override
    public void logOut() {
        System.out.println("高级代练AAA代练完成");
        gamePlayerAble.logOut();
        System.out.println("高级代练收费100元");
    }
}
