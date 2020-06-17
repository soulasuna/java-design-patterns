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
 * Description: 通过sql获得数据
 * </p>
 * ClassName: SqlDataSource
 *
 * @author dnt
 * @version V1.0.0
 * @date 2020/4/21、16:07
 * @since jdk1.8
 */
public class SqlDataSource extends BaseDataSource {
    /**
     * 通过sql在数据库中获得数据;
     * @return  数据
     */
    @Override
    protected String getDate() {
        return "在数据库中获得数据";
    }
}
