package com.example.allasignmodeltest1.composite.general;

import java.util.ArrayList;
import java.util.List;

/**
 * @author huanggaokui
 * @description: 干
 * @date 2022/2/24 0:05
 */
public class Composite extends Component{
    private List<Component> components = new ArrayList<>();
    public Composite(String name) {
        super(name);
    }
    public boolean addChild(Component child){
        return components.add(child);
    }
    public boolean removeChild(Component child){
        return components.remove(child);
    }
    public Component getChild(int index){
        return components.get(index);
    }

    @Override
    public String operation() {
        StringBuilder builder = new StringBuilder();
        builder.append(this.name);
        for(Component child : components){
            builder.append("\n");
            builder.append(child.operation());
        }
        return builder.toString();
    }

    @Override
    public String toString() {
        return this.name;
    }
}
