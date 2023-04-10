package com.yangweiyao.pattern.command;

/**
 * @Author yangweiyao
 * @CreateTime 2023-03-22 16:12
 * @Description
 **/
public class RemoteControl {

    private final Command[] onCommands;
    private final Command[] offCommands;
    private Command undoCommand; // 记录上一次命令


    /**
     * 遥控器
     * @param slotCount 插槽数
     */
    public RemoteControl(int slotCount) {

        onCommands = new Command[slotCount];
        offCommands = new Command[slotCount];

        Command noCommand = new NoCommand();
        for (int i = 0; i < slotCount; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        undoCommand = noCommand;
    }

    /**
     * 给插槽设置命令
     * @param slot 插槽位置
     * @param onCommand 开
     * @param offCommand 关
     */
    public void setCommand(int slot, Command onCommand, Command offCommand) {
        slot--;
        if(slot < onCommands.length) onCommands[slot] = onCommand;
        if(slot < offCommands.length) offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        slot--;
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    public void offButtonWasPushed(int slot) {
        slot--;
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    public void undoButtonWasPushed() {
        undoCommand.undo();
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("\n------ Remote Control ------\n");
        for (int i = 0; i < onCommands.length; i++) {
            builder.append("[slot ").append(i).append("] ")
                    .append(onCommands[i].getClass().getName())
                    .append("\t\t\t")
                    .append(offCommands[i].getClass().getName())
                    .append("\n");
        }
        return builder.toString();
    }
}
