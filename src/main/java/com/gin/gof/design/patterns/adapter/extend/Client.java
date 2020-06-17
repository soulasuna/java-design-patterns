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
package com.gin.gof.design.patterns.adapter.extend;

/**
 * <p>
 * Description: 客户端
 * </p>
 * ClassName: Client
 *
 * @author dnt
 * @version V1.0.0
 * @date 2020/4/20、16:33
 * @since jdk1.8
 */
public class Client {
    /**
     * 手机充电
     * 中国输入220V,日本输入110V.输入不同的适配器
     */
    public static void main(String[] args) {
        // 在日本充电
        JapanPhone japanPhone = new JapanPhone();
        String answer = japanPhone.powerOn(new Electricity("AC", 110, 2));
        // 显示"输入电正常,开始充电"
        System.out.println(answer);


        // 在中国充电
        ChinaPhone chinaPhone = new ChinaPhone();
        answer = chinaPhone.powerOn(new Electricity("AC", 220, 2));
        // 显示"输入电正常,开始充电"
        System.out.println(answer);
    }
}