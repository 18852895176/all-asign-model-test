package com.example.allasignmodeltest1.chain.general;

/**
 * @author huanggaokui
 * @description: 测试类
 * @date 2022/2/17 20:39
 */
public class Test {
    public static void main(String[] args) {
        Handler handlerA = new ConcreteHandlerA();
        Handler handlerB = new ConcreteHandlerB();
        handlerA.setNextHandler(handlerB);
        handlerA.handleRequest("hgk");
    }
}
