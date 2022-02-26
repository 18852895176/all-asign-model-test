package com.example.allasignmodeltest1.bridge.general;

/**
 * @author huanggaokui
 * @description: 抽象类
 * @date 2022/2/16 23:09
 */
public abstract class Abstraction {
    public IImplementor implementor;
    public Abstraction(IImplementor implementor){
        this.implementor = implementor;
    }
    abstract void operation();
}
