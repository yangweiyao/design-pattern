package com.yangweiyao.pattern.facade;

import com.yangweiyao.mode.facade.component.*;
import com.yangweiyao.pattern.facade.component.*;

/**
 * @Author yangweiyao
 * @CreateTime 2023-03-29 08:04
 * @Description 电脑有开机/关机功能
 **/
public class Computer {

    private Cpu cpu;
    private Disk disk;
    private Memory memory;
    private Charger charger;
    private MainBoard mainBoard;


    public Computer() {
        // 默认配置
        cpu = new Cpu();
        disk = new Disk();
        memory = new Memory();
        charger = new Charger();
        mainBoard = new MainBoard();
    }

    /**
     * 开机
     */
    public void start() {
        System.out.println("发送开机指令");
        charger.electrify();
        mainBoard.electrify();
        cpu.electrify();
        disk.electrify();
        memory.electrify();
    }

    /**
     * 关机
     */
    public void shutdown() {
        System.out.println("发送关机指令");
        mainBoard.close();
        memory.close();
        disk.close();
        cpu.close();
        charger.interrupt();
    }

    /**
     * 重启
     */
    public void reboot() {
        shutdown();
        start();
    }

    public Cpu getCpu() {
        return cpu;
    }

    public Disk getDisk() {
        return disk;
    }

    public Memory getMemory() {
        return memory;
    }

    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }

    public void setDisk(Disk disk) {
        this.disk = disk;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }

    public Charger getCharger() {
        return charger;
    }

    public void setCharger(Charger charger) {
        this.charger = charger;
    }

    public MainBoard getMainBoard() {
        return mainBoard;
    }

    public void setMainBoard(MainBoard mainBoard) {
        this.mainBoard = mainBoard;
    }
}
