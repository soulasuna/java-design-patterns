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
 * Description: 客户端
 * </p>
 * ClassName: Client
 *
 * @author dnt
 * @version V1.0.0
 * @date 2020/6/2、16:15
 * @since jdk1.8
 */
public class Client {
    public static void main(String[] args) {
        // 初始化遥控器
        CommandAble [] commands = {
                new LightOnCommand(new MideaLight()),new LightOffCommand(new MideaLight()),
                new LightUpCommand(new MideaLight()),new LightDownCommand(new MideaLight()),
                new VideoOnCommand(new MideaVideo()),new VideoOffCommand(new MideaVideo()),
                new VideoUpCommand(new MideaVideo()),new VideoDownCommand(new MideaVideo())};

        RemoteControl remoteControl = new RemoteControl(commands);

        // 打开灯
        System.out.println("打开灯");
        remoteControl.action(0);
        System.out.println("灯光调亮");
        remoteControl.action(2);
        System.out.println("灯光调亮");
        remoteControl.action(2);
        System.out.println("撤销上次操作");
        remoteControl.undo();
        System.out.println("关闭灯");
        remoteControl.action(1);

    }
}
