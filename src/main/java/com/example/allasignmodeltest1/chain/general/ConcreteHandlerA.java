package com.example.allasignmodeltest1.chain.general;

/**
 * @author huanggaokui
 * @description: 链A
 * @date 2022/2/17 20:36
 */
public class ConcreteHandlerA extends Handler{
    @Override
    public void handleRequest(String name) {
        System.out.println("A "+ name);
        if(this.getNextHandler() != null){
            this.getNextHandler().handleRequest(name);
        }
    }
}
