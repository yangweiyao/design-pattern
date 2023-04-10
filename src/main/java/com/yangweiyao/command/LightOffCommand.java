package com.yangweiyao.command;

import com.yangweiyao.command.product.Light;

/**
 * @Author yangweiyao
 * @CreateTime 2023-03-22 15:54
 * @Description
 **/
public class LightOffCommand implements Command {

    private final Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}
