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

import java.util.List;

/**
 * <p>
 * Description: 客户端
 * </p>
 * ClassName: Client
 *
 * @author dnt
 * @version V1.0.0
 * @date 2020/4/24、10:59
 * @since jdk1.8
 */
public class Client {
    /**
     * 显示学校机构树
     */
    public static void main(String[] args) {
        // 创建一个学校结构的树
        University university = new University(1,"北京大学");
        // 设置学院 通信工程学院 经济管理学院
        university.addChild(new College(2, "通信工程学院"));
        university.addChild(new College(3, "经济管理学院"));

        List<BaseOrganization> subOrganizationList = university.getSubOrganizationList();
        // 院系 计算机专业 通信工程
        BaseOrganization communicationEngineering = subOrganizationList.get(0);
        communicationEngineering.addChild(new Faculty(4,"计算机"));
        communicationEngineering.addChild(new Faculty(5,"通信工程"));

        // 院系 国际关系 国际贸易
        BaseOrganization economicsManagement = subOrganizationList.get(1);
        economicsManagement.addChild(new Faculty(6,"国际关系"));
        economicsManagement.addChild(new Faculty(7,"国际贸易"));

        System.out.println("----整个大学机构树----");
        university.show();

        System.out.println("----通信工程学院机构树----");
        communicationEngineering.show();

        System.out.println("----经济管理学院机构树----");
        communicationEngineering.show();
    }
}