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
package com.gin.gof.design.patterns.builder.inside;

/**
 * <p>
 * Description: 系统设置(建造的产品)
 * </p>
 * ClassName: SystemConfiguration
 *
 * @author dnt
 * @version V1.0.0
 * @date 2020/4/16、20:05
 * @since jdk1.8
 */
public final class SystemConfiguration {
    /**
     * 系统名称
     */
    private String applicationName;
    /**
     * 系统版本
     */
    private String applicationVersion;

    /**
     * 根据参数初始化对象
     * @param applicationName       应用名称
     * @param applicationVersion    应用版本
     * @return
     */
    public static SystemConfiguration builder(String applicationName, String applicationVersion) {
        return new Builder()
                .applicationName(applicationName)
                .applicationVersion(applicationVersion)
                .build();
    }

    /**
     * 根据配置对象来初始化参数
     * @param configurationParam    配置对象{@link ConfigurationParam}
     * @return                      系统配置对象
     */
    public static SystemConfiguration builder(ConfigurationParam configurationParam) {
        return new Builder()
                .applicationName(configurationParam.getName())
                .applicationVersion(configurationParam.getVersion())
                .build();
    }
    @Override
    public String toString() {
        return "SystemConfiguration{" +
                "applicationName='" + applicationName + '\'' +
                ", applicationVersion='" + applicationVersion + '\'' +
                '}';
    }

    private SystemConfiguration(String applicationName, String applicationVersion) {
        this.applicationName = applicationName;
        this.applicationVersion = applicationVersion;
    }

    private static class Builder{
        private String applicationName;
        private String applicationVersion;
        Builder applicationName(String applicationName){
            this.applicationName = applicationName;
            return this;
        }
        Builder applicationVersion(String applicationVersion){
            this.applicationVersion = applicationVersion;
            return this;
        }

        SystemConfiguration build(){
            // 这里主要是做具体参数的检验

            // 返回构建好的对象
            return new SystemConfiguration(this.applicationName,this.applicationVersion);
        }
    }
}
