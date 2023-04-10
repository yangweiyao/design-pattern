package com.yangweiyao.pattern.command;

/**
 * @Author yangweiyao
 * @CreateTime 2023-03-22 15:59
 * @Description 遥控器
 **/
public class SimpleRemoteControl {

    private Command command;

    /**
     * 按下按钮
     */
    public void buttonWasPressed() {
        command.execute();
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void undoButtonWasPushed() {
        command.undo();
    }

}
