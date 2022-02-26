package com.example.allasignmodeltest1.composite.general;

/**
 * @author huanggaokui
 * @description: 组件
 * @date 2022/2/24 0:02
 */
public abstract class Component {
    protected String name;
    public Component(String name) {
        this.name = name;
    }
    public abstract String operation();
}
