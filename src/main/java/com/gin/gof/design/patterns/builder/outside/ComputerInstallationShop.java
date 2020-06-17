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
 * Description: 电脑组装店(建造指挥者)
 * </p>
 * ClassName: ComputerInstallationShop
 *
 * @author dnt
 * @version V1.0.0
 * @date 2020/4/16、14:30
 * @since jdk1.8
 */
public class ComputerInstallationShop {
    /**
     * 装机员(建造者)
     */
    private BaseComputerInstaller baseComputerInstaller;
    /**
     * <p>
     * Description: 根据装机单组装电脑
     * </p>
     * @param computerConfiguration     电脑配置单{@link ComputerConfiguration}
     * @return                          电脑 {@link Computer}
     *
     * @author dnt
     * @date 2020/4/16 11:09
     */
    public final Computer buildComputer(ComputerConfiguration computerConfiguration){
        // 根据配置单决定,电脑主机定价,找到合适的装机员
        Computer computer = new Computer();
        this.baseComputerInstaller = this.findComputerInstaller(computerConfiguration,computer);

        // 装机员组装电脑
        return this.baseComputerInstaller
                .installCpu()
                .installMotherboard()
                .installGraphics()
                .buildComputer();
    }
    /**
     * 根据配置找到合适的装机员
     * 简单处理专业装i9,普通装其他
     * @param computerConfiguration
     * @return
     */
    private BaseComputerInstaller findComputerInstaller(ComputerConfiguration computerConfiguration, Computer computer) {
        if (computerConfiguration.getCpuName().startsWith("i9-")){
            return new ProfessionComputerInstaller(computerConfiguration,computer);
        }
        return new GeneralComputerInstaller(computerConfiguration,computer);
    }
}
