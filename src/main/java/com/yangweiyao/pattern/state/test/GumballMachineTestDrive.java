package com.yangweiyao.pattern.state.test;

import com.yangweiyao.pattern.state.GumballMachine;
import com.yangweiyao.pattern.state.GumballMachine_V2;

/**
 * @Author yangweiyao
 * @CreateTime 2023-04-13 08:17
 * @Description
 **/
public class GumballMachineTestDrive {

    public static void main(String[] args) {
//        GumballMachine gumballMachine = new GumballMachine(5);
        GumballMachine_V2 gumballMachine = new GumballMachine_V2(1000);

        System.out.println(gumballMachine);

        System.out.println("========== 场景1 ==========");
        // 投币
        gumballMachine.insertQuarter();
        // 推动杆子
        gumballMachine.turnCrank();
        System.out.println(gumballMachine);

        System.out.println("========== 场景2 ==========");
        // 投币
        gumballMachine.insertQuarter();
        // 不想要了，退币
        gumballMachine.ejectQuarter();
        // 推动杆子
        gumballMachine.turnCrank();
        System.out.println(gumballMachine);

        System.out.println("========== 场景3 ==========");
        // 投币
        gumballMachine.insertQuarter();
        // 推动杆子
        gumballMachine.turnCrank();
        // 投币
        gumballMachine.insertQuarter();
        // 推动杆子
        gumballMachine.turnCrank();
        gumballMachine.ejectQuarter();
        System.out.println(gumballMachine);

        System.out.println("========== 场景4 ==========");
        int count = 1000;
        do {
            // 投币
            gumballMachine.insertQuarter();
            // 推动杆子
            gumballMachine.turnCrank();
            System.out.println(gumballMachine);
            count--;
        } while (count > 0);

    }

}
