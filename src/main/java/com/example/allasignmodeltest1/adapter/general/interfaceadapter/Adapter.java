package com.example.allasignmodeltest1.adapter.general.interfaceadapter;

/**
 * @author huanggaokui
 * @description: 适配器
 * @date 2022/2/16 20:59
 */
public class Adapter implements Target{
    private Adaptee adaptee;
    public Adapter(Adaptee adaptee){
        this.adaptee = adaptee;
    }

    @Override
    public int request() {
        return adaptee.specificRequest() * 2;
    }
}
