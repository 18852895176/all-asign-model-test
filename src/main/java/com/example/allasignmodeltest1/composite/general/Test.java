package com.example.allasignmodeltest1.composite.general;

/**
 * @author huanggaokui
 * @description: 测试类
 * @date 2022/2/24 0:11
 */
public class Test {
    public static void main(String[] args) {
        Composite root = new Composite("root");

        Composite composite1 = new Composite("枝1");
        Composite composite2 = new Composite("枝2");

        composite2.addChild(new Leaf("叶3"));
        composite1.addChild(composite2);

        root.addChild(composite1);
        root.addChild(new Leaf("叶1"));

        System.out.println(root.operation());
    }
}
