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

import org.springframework.util.Assert;

/**
 * <p>
 * Description: 字符串转化
 * </p>
 * ClassName: ConversionString
 *
 * @author dnt
 * @version V1.0.0
 * @date 2020/4/30、14:19
 * @since jdk1.8
 */
public class ConversionString {
    /**
     * 字符串小写转大写
     *
     * @param input 输入字符串
     * @return 格式化字符串
     */
    public String stringToUpCase(String input) {
        Assert.hasText(input, "error : input string can not empty");
        return input.toUpperCase();
    }



}
