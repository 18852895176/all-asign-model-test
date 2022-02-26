package com.example.allasignmodeltest1.command.general;

/**
 * @author huanggaokui
 * @description: 发令者
 * @date 2022/2/17 21:55
 */
public class Invoker {
    private ICommand command = new ConcreteCommandA();

    public void action(){
        command.execute();
    }

}
