package com.yangweiyao.mode.command;

import com.yangweiyao.mode.command.product.Light;

/**
 * @Author yangweiyao
 * @CreateTime 2023-03-22 15:54
 * @Description
 **/
public class LightOnCommand implements Command {

    private final Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
