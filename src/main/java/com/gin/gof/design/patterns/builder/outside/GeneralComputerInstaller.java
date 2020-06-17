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

/**
 * <p>
 * Description: 一般的装机员(建造者的实现类)
 * </p>
 * ClassName: GeneralComputerInstaller
 *
 * @author dnt
 * @version V1.0.0
 * @date 2020/4/16、15:44
 * @since jdk1.8
 */
public class GeneralComputerInstaller extends BaseComputerInstaller {
    public GeneralComputerInstaller(ComputerConfiguration configuration, Computer computer) {
        super(configuration, computer);
    }

    @Override
    protected BaseComputerInstaller installCpu() {
        ComputerConfiguration configuration = this.configuration;
        this.computer.getProducts().add(new Cpu(1000,configuration.getCpuName()));
        return this;
    }

    @Override
    protected BaseComputerInstaller installMotherboard() {
        ComputerConfiguration configuration = this.configuration;
        this.computer.getProducts().add(new Motherboard(500,configuration.getMotherboardName()));
        return this;
    }
    @Override
    protected BaseComputerInstaller installGraphics() {
        ComputerConfiguration configuration = this.configuration;
        this.computer.getProducts().add(new Graphics(1500,configuration.getGraphicsName()));
        return this;
    }
    /**
     * 一般装机人员没有特殊能力
     * @return
     */
    @Override
    public Computer buildComputer() {
        return super.computer;
    }
}
