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

import java.util.LinkedList;

/**
 * <p>
 * Description: 万能遥控器
 * </p>
 * ClassName: RemoteControl
 *
 * @author dnt
 * @version V1.0.0
 * @date 2020/6/2、16:20
 * @since jdk1.8
 */
public class RemoteControl {
    /**
     * 命令数组
     */
    private CommandAble [] commands;
    /**
     * 撤销命令列表
     */
    private LinkedList<CommandAble> undoCommandList = new LinkedList<>();

    public RemoteControl(CommandAble[] commands) {
        this.commands = commands;
    }
    /**
     * 执行命令
     * @param index 命令编号
     */
    public void action(int index){
        CommandAble command = commands [index];
        command.execute();
        // 执行成功,记录执行的命令
        undoCommandList.push(command);
    }
    /**
     * 撤销上次操作
     */
    public void undo(){
        CommandAble command = undoCommandList.pop();
        if (command == null){
            return;
        }
        command.undo();
    }
}
