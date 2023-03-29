package com.yangweiyao.mode.facade.test;

import com.yangweiyao.mode.facade.Computer;

/**
 * @Author yangweiyao
 * @CreateTime 2023-03-29 08:27
 * @Description 门面模式（外观模式）：为复杂的模块或子系统提供外界访问的模块
 **/
public class ComputerTest {

    public static void main(String[] args) {
        // 购买一台新电脑
        Computer computer = new Computer();
        System.out.println("插上电源");
        System.out.println("\n========== 按下开机键 ==========");
        computer.start();

        System.out.println("\n========== 按下重启键 ==========");
        computer.reboot();

        System.out.println("\n========== 按下关机键 ==========");
        computer.shutdown();

        System.out.println("\n拔掉电源");

    }

}
