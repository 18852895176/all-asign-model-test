package com.example.allasignmodeltest1.bridge.general;

/**
 * @author huanggaokui
 * @description: 实现抽象类
 * @date 2022/2/16 23:16
 */
public class RefinedAbstraction extends Abstraction{
    public RefinedAbstraction(IImplementor implementor) {
        super(implementor);
    }

    @Override
    public void operation() {
        this.implementor.operatonImpl();
    }
}
