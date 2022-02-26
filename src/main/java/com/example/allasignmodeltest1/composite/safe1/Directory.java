package com.example.allasignmodeltest1.composite.safe1;

/**
 * @author huanggaokui
 * @description: 文件
 * @date 2022/2/25 22:10
 */
public abstract class Directory {
    protected String name;
    public Directory(String name){
        this.name = name;
    }
    public abstract void show();
}
