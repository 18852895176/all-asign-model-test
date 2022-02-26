package com.example.allasignmodeltest1.adapter.general.interfaceadapter;

/**
 * @author huanggaokui
 * @description: 测试类
 * @date 2022/2/16 21:01
 */
public class Test {
    public static void main(String[] args) {
        Target target = new Adapter(new Adaptee());
        System.out.println(target.request());;
    }
}
