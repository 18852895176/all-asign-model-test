package com.example.allasignmodeltest1.command.general;

/**
 * @author huanggaokui
 * @description: 命令实现
 * @date 2022/2/17 21:56
 */
public class ConcreteCommandA implements ICommand{
    private Receiver receiver = new Receiver();
    @Override
    public void execute() {
        System.out.println("A");
        receiver.action();
    }
}
