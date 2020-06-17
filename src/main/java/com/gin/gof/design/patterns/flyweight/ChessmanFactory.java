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

import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/**
 * <p>
 * Description: 棋子工厂
 * </p>
 * ClassName: ChessmanFactory
 *
 * @author dnt
 * @version V1.0.0
 * @date 2020/4/23、18:47
 * @since jdk1.8
 */
public class ChessmanFactory {
    /**
     * 内部属性相同的对象的缓冲池
     */
    private static Map<String,Chessman> map = new ConcurrentHashMap<>(2);

    /**
     * 获得棋子的方法
     * @param color 根据颜色获得(颜色是棋子的内部属性)
     * @return      棋子
     */
    public static Chessman getChessman(String color){
        Chessman chessman = map.get(color);
        if (Objects.isNull(chessman)){
            chessman = new Chessman(color);
            map.put(color,chessman);
        }
        return chessman;
    }
}
