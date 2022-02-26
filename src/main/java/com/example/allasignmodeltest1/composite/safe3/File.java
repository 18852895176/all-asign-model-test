package com.example.allasignmodeltest1.composite.safe3;

/**
 * @author huanggaokui
 * @description: 文件
 * @date 2022/2/25 23:31
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
