package com.example.allasignmodeltest1.composite.safe1;

/**
 * @author huanggaokui
 * @description: 测试类
 * @date 2022/2/25 22:24
 */
public class Test {
    public static void main(String[] args) {
        Folder root = new Folder("D盘", 1);
        Folder office = new Folder("office", 2);

        File qq = new File("qq");
        File wx = new File("wx");

        File word = new File("word");
        File ppt = new File("ppt");
        File excel = new File("excel");

        root.addChild(office);
        root.addChild(qq);
        root.addChild(wx);

        office.addChild(word);
        office.addChild(excel);
        office.addChild(ppt);

        root.show();
    }
}
