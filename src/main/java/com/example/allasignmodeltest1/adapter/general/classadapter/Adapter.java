package com.example.allasignmodeltest1.adapter.general.classadapter;

/**
 * @author huanggaokui
 * @description: 适配器
 * @date 2022/2/16 20:55
 */
public class Adapter extends Adaptee implements Target{

    @Override
    public void request() {
        super.specificRequest();
    }
}
