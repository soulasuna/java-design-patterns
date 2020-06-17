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
 * Description: 客户端
 * </p>
 * ClassName: Client
 *
 * @author dnt
 * @version V1.0.0
 * @date 2020/4/21、15:26
 * @since jdk1.8
 */
public class Client {
    /**
     * 显示数据报表客户端
     */
    public static void main(String[] args) {
        Report report = initReport("pie","sql");
        String reportContent = report.showReport();
        System.out.println(reportContent);
    }

    private static Report initReport(String shape, String dataType){
        Report report = new Report();
        report.setDataShape("pie".equals(shape)? new PieDataShape() : new ColumnarDataShape());
        report.setDataSource("sql".equals(dataType)? new SqlDataSource() : new XmlDataSource());
        return report;
    }
}
