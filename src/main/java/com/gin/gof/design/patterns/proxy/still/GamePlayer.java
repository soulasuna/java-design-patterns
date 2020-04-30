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
 * Description: 游戏玩家(被代理类)
 * </p>
 * ClassName: GamePlayer
 *
 * @author dnt
 * @version V1.0.0
 * @date 2020/4/28、17:07
 * @since jdk1.8
 */
public class GamePlayer implements GamePlayerAble{
    /**
     * 用户名
     */
    private String username;
    /**
     * 密码
     */
    private String password;

    public GamePlayer(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public void logIn() {
        System.out.println("账号:"+username+"登录,输入密码"+password);
    }

    @Override
    public void play() {
        System.out.println("账号:"+username+"打怪升级中");
    }

    @Override
    public void logOut() {
        System.out.println("账号:"+username+"退出游戏");
    }
}
