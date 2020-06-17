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
 * Description: 学院
 * </p>
 * ClassName: College
 *
 * @author dnt
 * @version V1.0.0
 * @date 2020/4/24、15:57
 * @since jdk1.8
 */
public class College extends BaseOrganization {
    /**
     * 构造方法
     *
     * @param id   机构编码
     * @param name 机构名称
     */
    public College(Integer id, String name) {
        super(id, name);
    }
    @Override
    public boolean addChild(BaseOrganization organization) {
        return subOrganizationList.add(organization);
    }
    @Override
    public void show() {
        System.out.println(toString());
        // 遍历子节点
        if (!subOrganizationList.isEmpty()){
            subOrganizationList.forEach(CompositeAble::show);
        }
    }
}
