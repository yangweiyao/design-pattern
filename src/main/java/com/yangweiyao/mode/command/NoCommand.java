package com.yangweiyao.mode.command;

/**
 * @Author yangweiyao
 * @CreateTime 2023-03-22 16:15
 * @Description 空对象
 **/
public class NoCommand implements Command {
    @Override
    public void execute() {
        // 什么都不做
    }

    @Override
    public void undo() {

    }
}
