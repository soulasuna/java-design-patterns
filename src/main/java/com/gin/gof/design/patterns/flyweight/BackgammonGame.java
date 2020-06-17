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
package com.gin.gof.design.patterns.flyweight;

/**
 * <p>
 * Description: 五子棋游戏
 * </p>
 * ClassName: BackgammonGame
 *
 * @author dnt
 * @version V1.0.0
 * @date 2020/4/23、18:30
 * @since jdk1.8
 */
public class BackgammonGame {
    /**
     * 黑子先手还是白字先手
     */
    private String firstMoveColor;
    public BackgammonGame(String firstMoveColor) {
        this.firstMoveColor = firstMoveColor;
    }
    private Integer step = 0;
    /**
     * 下棋
     */
    public String play(Coordinate coordinate){
        // 计数器加一
        step = ++step;
        // 工厂中获得对象
        String color = step%2 == 0 ? "red" : "black";
        Chessman chessman = ChessmanFactory.getChessman(color);
        // 棋子工厂中获得棋子
        return "坐标:" + coordinate + "出现棋子" + chessman;
    }
}
