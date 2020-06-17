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
package com.gin.gof.design.patterns.composite.clear;

/**
 * <p>
 * Description: 组合能力接口
 * </p>
 * InterfaceName: CompositeAble
 *
 * @author dnt
 * @version V1.0.0
 * @date 2020/4/24、15:33
 * @since jdk1.8
 */
public interface CompositeAble {
    /**
     * 添加子机构
     * @param organization  具体机构对象
     * @return              成功true,其他false
     */
    boolean addChild(BaseOrganization organization);
    /**
     * 显示机构树
     */
    void show();
}
