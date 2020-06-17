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
 * Description: 电源
 * </p>
 * ClassName: Electricity
 *
 * @author dnt
 * @version V1.0.0
 * @date 2020/4/20、16:46
 * @since jdk1.8
 */
public class Electricity {
    /**
     * 类型
     */
    private String type;
    /**
     * 电压
     */
    private Integer voltage;
    /**
     * 电流
     */
    private Integer current;
    public Electricity(String type, Integer voltage, Integer current) {
        this.type = type;
        this.voltage = voltage;
        this.current = current;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public Integer getVoltage() {
        return voltage;
    }
    public void setVoltage(Integer voltage) {
        this.voltage = voltage;
    }
    public Integer getCurrent() {
        return current;
    }
    public void setCurrent(Integer current) {
        this.current = current;
    }
}
