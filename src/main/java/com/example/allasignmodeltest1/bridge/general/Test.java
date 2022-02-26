package com.example.allasignmodeltest1.bridge.general;

/**
 * @author huanggaokui
 * @description: 测试类
 * @date 2022/2/16 23:19
 */
public class Test {
    public static void main(String[] args) {
        Abstraction abstraction = new RefinedAbstraction(new ConcreteImplementorA());
        abstraction.operation();
    }
}
