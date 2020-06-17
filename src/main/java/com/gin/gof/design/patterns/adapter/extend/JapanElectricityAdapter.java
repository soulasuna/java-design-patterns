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
 * Description: 日本标准适配器
 * </p>
 * ClassName: JapanElectricityAdapter
 *
 * @author dnt
 * @version V1.0.0
 * @date 2020/4/20、17:19
 * @since jdk1.8
 */
public class JapanElectricityAdapter extends BaseElectricityAdapter {
    /**
     * 电压转化
     * @param electricity   转换电压
     * @return
     */
    @Override
    protected Electricity conversionElectricity(Electricity electricity) {
        // 简单校验输入参数
        if (110 != electricity.getVoltage()){
            throw new RuntimeException();
        }
        // 转化参数
        electricity.setType("DC");
        electricity.setVoltage(5);
        electricity.setCurrent(1);
        return electricity;
    }
}
