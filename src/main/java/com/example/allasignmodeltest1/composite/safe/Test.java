package com.example.allasignmodeltest1.composite.safe;

/**
 * @author huanggaokui
 * @description: 测试类
 * @date 2022/2/25 21:54
 */
public class Test {
    public static void main(String[] args) {
        File qq= new File("QQ.exe");
        File wx = new File("微信.exe");

        Folder office = new Folder("办公软件", 2);

        File word = new File("Word.exe");
        File ppt = new File("Powerpoint.exe");
        File excel = new File("Excel.exe");

        office.addChild(word);
        office.addChild(ppt);
        office.addChild(excel);


        Folder root=new Folder("D盘", 1);

        root.addChild(office);

        root.addChild(qq);
        root.addChild(wx);

        root.show();
    }
}
