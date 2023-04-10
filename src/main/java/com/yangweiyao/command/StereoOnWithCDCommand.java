package com.yangweiyao.command;

import com.yangweiyao.command.product.Stereo;

/**
 * @Author yangweiyao
 * @CreateTime 2023-03-22 17:38
 * @Description
 **/
public class StereoOnWithCDCommand implements Command {

    private final Stereo stereo;

    public StereoOnWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.playCD();
        stereo.setVolume(15);
    }

    @Override
    public void undo() {
        stereo.off();
    }

}
