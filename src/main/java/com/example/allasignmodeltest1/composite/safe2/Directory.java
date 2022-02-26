package com.example.allasignmodeltest1.composite.safe2;

/**
 * @author huanggaokui
 * @description: 文件组件
 * @date 2022/2/25 22:58
 */
public abstract class Directory {
    protected String name;
    public Directory(String name){
        this.name = name;
    }
    public abstract void show();
}
