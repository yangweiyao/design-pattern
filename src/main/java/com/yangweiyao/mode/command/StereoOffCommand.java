package com.yangweiyao.mode.command;

import com.yangweiyao.mode.command.product.Stereo;

/**
 * @Author yangweiyao
 * @CreateTime 2023-03-22 17:38
 * @Description
 **/
public class StereoOffCommand implements Command {

    private final Stereo stereo;

    public StereoOffCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.off();
    }

    @Override
    public void undo() {
        stereo.on();
    }
}
