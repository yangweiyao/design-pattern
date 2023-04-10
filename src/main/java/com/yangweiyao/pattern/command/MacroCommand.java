package com.yangweiyao.pattern.command;

/**
 * @Author yangweiyao
 * @CreateTime 2023-03-23 15:54
 * @Description
 **/
public class MacroCommand implements Command {

    private final Command[] commands;

    public MacroCommand(Command[] commands) {
        this.commands = commands;
    }


    @Override
    public void execute() {
        for (Command command : commands) {
            command.execute();
        }
    }

    @Override
    public void undo() {
        for (Command command : commands) {
            command.undo();
        }
    }
}
