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
package com.gin.gof.design.patterns.bridge;

/**
 * <p>
 * Description: 报表类
 * </p>
 * ClassName: Report
 *
 * @author dnt
 * @version V1.0.0
 * @date 2020/4/21、17:19
 * @since jdk1.8
 */
public class Report {
    /**
     * 数据源
     */
    private BaseDataSource dataSource;
    /**
     * 数据表现方式
     */
    private BaseDataShape dataShape;
    public void setDataSource(BaseDataSource dataSource) {
        this.dataSource = dataSource;
    }
    public void setDataShape(BaseDataShape dataShape) {
        this.dataShape = dataShape;
    }
    /**
     * 获得处理参数形成报表返回
     * @return      报表内容
     */
    public String showReport(){
        String date = this.dataSource.getDate();
        return this.dataShape.formatData(date);
    }
}