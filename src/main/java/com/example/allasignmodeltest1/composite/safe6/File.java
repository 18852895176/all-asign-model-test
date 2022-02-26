package com.example.allasignmodeltest1.composite.safe6;

/**
 * @author huanggaokui
 * @description: 文件
 * @date 2022/2/25 23:55
 */
public class File extends Directory{

    public File(String name) {
        super(name);
    }

    @Override
    public void show() {
        System.out.println(this.name);
    }
}
