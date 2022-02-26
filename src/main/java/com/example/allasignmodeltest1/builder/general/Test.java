package com.example.allasignmodeltest1.builder.general;

/**
 * @author huanggaokui
 * @description: 测试类
 * @date 2022/2/17 0:05
 */
public class Test {
    public static void main(String[] args) {
        IBuilder builder = new ConcreteBuilder();
        System.out.println(builder.build());
    }
}
