package com.yangweiyao.pattern.command.test;

import com.yangweiyao.command.*;
import com.yangweiyao.pattern.command.*;
import com.yangweiyao.pattern.command.product.Light;
import com.yangweiyao.pattern.command.product.Stereo;

/**
 * @Author yangweiyao
 * @CreateTime 2023-03-22 16:04
 * @Description
 **/
public class RemoteControlTest {

    public static void main(String[] args) throws Exception {

        SimpleRemoteControl control = new SimpleRemoteControl();
        Command command = new LightCommand(new Light("卧室"));
        control.setCommand(command);
        control.buttonWasPressed();
        control.buttonWasPressed();
        control.undoButtonWasPushed();

        RemoteControl remoteControl = new RemoteControl(3);

        Light light = new Light("厨房");
        Command cookOnCommand = new LightOnCommand(light);
        Command cookOffCommand = new LightOffCommand(light);

        Stereo stereo = new Stereo("客厅");
        Command roomOnCommand = new StereoOnWithCDCommand(stereo);
        Command roomOffCommand = new StereoOffCommand(stereo);

        remoteControl.setCommand(1, cookOnCommand, cookOffCommand);
        remoteControl.setCommand(2, roomOnCommand, roomOffCommand);

        System.out.println(remoteControl);

        remoteControl.onButtonWasPushed(1);
        remoteControl.onButtonWasPushed(2);

        remoteControl.offButtonWasPushed(1);
        remoteControl.undoButtonWasPushed();
        Thread.sleep(3);
        remoteControl.offButtonWasPushed(2);

        remoteControl.onButtonWasPushed(3);
        remoteControl.offButtonWasPushed(3);

        System.out.println("============= 宏命令 =============");
        Command[] onCommands = {cookOnCommand, roomOnCommand};
        Command[] offCommands = {cookOffCommand, roomOffCommand};
        MacroCommand onMacroCommand = new MacroCommand(onCommands);
        MacroCommand offMacroCommand = new MacroCommand(offCommands);
        remoteControl.setCommand(3, onMacroCommand, offMacroCommand);
        remoteControl.onButtonWasPushed(3);
        remoteControl.offButtonWasPushed(3);
        System.out.println("============= 撤回 =============");
        remoteControl.undoButtonWasPushed();

    }

}
