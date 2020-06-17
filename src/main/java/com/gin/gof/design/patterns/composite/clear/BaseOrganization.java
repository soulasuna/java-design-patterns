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

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * Description: 机构抽象类
 * </p>
 * ClassName: BaseOrganization
 *
 * @author dnt
 * @version V1.0.0
 * @date 2020/4/24、15:31
 * @since jdk1.8
 */
public abstract class BaseOrganization implements CompositeAble {
    /**
     * 数据id
     */
    protected Integer id;
    /**
     * 机构名称
     */
    protected String name;
    /**
     * 机构包含的子机构
     */
    protected List<BaseOrganization> subOrganizationList = new ArrayList<>();
    /**
     * 构造方法
     * @param id    机构编码
     * @param name  机构名称
     */
    public BaseOrganization(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public List<BaseOrganization> getSubOrganizationList() {
        return subOrganizationList;
    }

    @Override
    public String toString() {
        return "BaseOrganization{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

