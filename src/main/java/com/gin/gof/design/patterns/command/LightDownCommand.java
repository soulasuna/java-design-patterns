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
 * Description: 电灯亮度调低
 * </p>
 * ClassName: LightDownCommand
 *
 * @author dnt
 * @version V1.0.0
 * @date 2020/6/2、18:12
 * @since jdk1.8
 */
public class LightDownCommand implements CommandAble {
    private BaseLight light;
    public LightDownCommand(BaseLight light) {
        this.light = light;
    }
    @Override
    public void execute() {
        light.down();
    }

    @Override
    public void undo() {
        light.up();
    }
}
