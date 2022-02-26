package com.example.allasignmodeltest1.composite.general;

/**
 * @author huanggaokui
 * @description: 叶
 * @date 2022/2/24 0:10
 */
public class Leaf extends Component{
    public Leaf(String name) {
        super(name);
    }

    @Override
    public String operation() {
        return this.name;
    }
}
