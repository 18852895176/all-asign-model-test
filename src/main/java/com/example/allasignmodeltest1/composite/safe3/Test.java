package com.example.allasignmodeltest1.composite.safe3;

/**
 * @author huanggaokui
 * @description: 测试类
 * @date 2022/2/25 23:31
 */
public class Test {
    public static void main(String[] args) {
        Folder root = new Folder("D盘", 1);
        Folder office = new Folder("office", 2);

        File word = new File("word");
        File ppt = new File("ppt");
        File excel = new File("excel");

        File qq = new File("qq");
        File wx = new File("wx");

        root.addChild(office);
        root.addChild(qq);
        root.addChild(wx);

        office.addChild(word);
        office.addChild(ppt);
        office.addChild(excel);

        root.show();
    }
}
