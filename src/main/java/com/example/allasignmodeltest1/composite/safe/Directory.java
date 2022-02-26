package com.example.allasignmodeltest1.composite.safe;

/**
 * @author huanggaokui
 * @description: 文件
 * @date 2022/2/25 21:35
 */
public abstract class Directory {
    protected String name;
    public Directory(String name){
        this.name = name;
    }
    public abstract void show();
}
