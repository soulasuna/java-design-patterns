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
package com.gin.gof.design.patterns.proxy.dynamic.cglib;

/**
 * <p>
 * Description: 处理数据转换的接口
 * </p>
 * ClassName: ConversionDataImpl
 *
 * @author dnt
 * @version V1.0.0
 * @date 2020/4/29、15:48
 * @since jdk1.8
 */
public class ConversionDataImpl{
    /**
     * 字符串转换大写
     * @param input    输入字符串
     * @return          处理结果
     */
    public String StringUpCaseFormat(String input) {
        return input == null ? "" : input.toUpperCase();
    }
}
