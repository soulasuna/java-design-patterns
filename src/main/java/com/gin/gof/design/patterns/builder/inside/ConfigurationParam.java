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
 * Description: 参数
 * </p>
 * ClassName: ConfigurationParam
 *
 * @author dnt
 * @version V1.0.0
 * @date 2020/4/17、14:05
 * @since jdk1.8
 */
public class ConfigurationParam {
    /**
     * 系统名称
     */
    private String name;
    /**
     * 系统版本
     */
    private String version;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public ConfigurationParam(String name, String version) {
        this.name = name;
        this.version = version;
    }
}
