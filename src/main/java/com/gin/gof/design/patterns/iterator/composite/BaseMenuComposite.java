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
package com.gin.gof.design.patterns.iterator.composite;

/**
 * <p>
 * Description: 菜单基本组合类
 * </p>
 * ClassName: BaseMenuComposite
 *
 * @author dnt
 * @version V1.0.0
 * @date 2020/6/10、11:09
 * @since jdk1.8
 */
public abstract class BaseMenuComposite implements CompositeAble<BaseMenuComposite>,
        IteratorAble<BaseMenuComposite> {
    protected String name;
    /**
     * 实现展示菜单内容
     */
    @Override
    public void show() {
        IteratorAble<BaseMenuComposite> iterator = this.createIterator();
        if (iterator == null){
            System.out.println(this.toString());
            return;
        }
        System.out.println("菜单列表名称: " + name);
        BaseMenuComposite next;
        while (iterator.hasNext()){
            next = iterator.next();
            next.show();
        }
    }
}
