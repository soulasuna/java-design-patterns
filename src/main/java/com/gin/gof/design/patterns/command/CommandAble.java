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
package com.gin.gof.design.patterns.command;

/**
 * <p>
 * Description: 命令能力接口
 * </p>
 * InterfaceName: CommandAble
 *
 * @author dnt
 * @version V1.0.0
 * @date 2020/6/2、16:25
 * @since jdk1.8
 */
public interface CommandAble {
    /**
     * 执行操作
     */
    void execute();
    /**
     * 撤销操作
     */
    void undo();
}
