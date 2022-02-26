package com.example.allasignmodeltest1.composite.safe;

/**
 * @author huanggaokui
 * @description: 文件
 * @date 2022/2/25 21:36
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
