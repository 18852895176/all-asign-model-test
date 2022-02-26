package com.example.allasignmodeltest1.builder.general;

/**
 * @author huanggaokui
 * @description: 建造者实现类
 * @date 2022/2/16 23:59
 */
public class ConcreteBuilder implements IBuilder{
    Product product = new Product();
    @Override
    public Product build() {
        return product;
    }
}
