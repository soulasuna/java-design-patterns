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
 * Description: 日本手机集成日本标准的适配器
 * </p>
 * ClassName: JapanPhone
 *
 * @author dnt
 * @version V1.0.0
 * @date 2020/4/20、17:48
 * @since jdk1.8
 */
public class JapanPhone extends JapanElectricityAdapter {
    /**
     * 手机充电
     */
    public String powerOn(Electricity electricity){
        // 调用充电器转换电压电流
        Electricity electricityCharge;
        try{
            electricityCharge = super.conversionElectricity(electricity);
        }catch (Exception e){
            return "输入电压错误";
        }
        return this.charging(electricityCharge);
    }
    /**
     * 输入电判断 直流电,5V,1A
     * @param electricity   输入电
     * @return              输入电正确返回true,其他false
     */
    private String charging(Electricity electricity){
        return "DC".equals(electricity.getType())
                && 5 == electricity.getVoltage()
                && 1 == electricity.getCurrent()
                ? "输入电正常,开始充电"
                : "输入电异常,停止充电";
    }
}
