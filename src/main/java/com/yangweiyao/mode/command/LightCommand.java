package com.yangweiyao.mode.command;

import com.yangweiyao.mode.command.product.Light;

/**
 * @Author yangweiyao
 * @CreateTime 2023-03-22 15:54
 * @Description
 **/
public class LightCommand implements Command {

    private final Light light;

    public LightCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        if(light.getStatus() == 0) {
            light.off();
        }
        else if (light.getStatus() == 1) {
            light.on();
        }
    }

    @Override
    public void undo() {
        // 智能电灯没有撤回
    }
}
