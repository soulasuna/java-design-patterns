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
package com.gin.gof.design.patterns.builder.outside;

import java.io.Serializable;

/**
 * <p>
 * Description: 装机单
 * </p>
 * ClassName: ComputerConfiguration
 *
 * @author dnt
 * @version V1.0.0
 * @date 2020/4/13、18:03
 * @since jdk1.8
 */
public class ComputerConfiguration implements Serializable {
    /**
     * cpu配置
     */
    private String cpuName;
    /**
     * 主板配置
     */
    private String motherboardName;
    /**
     * 显卡配置
     */
    private String graphicsName;

    public ComputerConfiguration(String cpuName, String motherboardName, String graphicsName) {
        this.cpuName = cpuName;
        this.motherboardName = motherboardName;
        this.graphicsName = graphicsName;
    }

    public String getCpuName() {
        return cpuName;
    }

    public void setCpuName(String cpuName) {
        this.cpuName = cpuName;
    }

    public String getMotherboardName() {
        return motherboardName;
    }

    public void setMotherboardName(String motherboardName) {
        this.motherboardName = motherboardName;
    }

    public String getGraphicsName() {
        return graphicsName;
    }

    public void setGraphicsName(String graphicsName) {
        this.graphicsName = graphicsName;
    }

    @Override
    public String toString() {
        return "ComputerConfiguration{" +
                "cpuName='" + cpuName + '\'' +
                ", motherboardName='" + motherboardName + '\'' +
                ", graphicsName='" + graphicsName + '\'' +
                '}';
    }
}
