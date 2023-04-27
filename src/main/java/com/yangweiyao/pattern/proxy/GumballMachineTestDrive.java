package com.yangweiyao.pattern.proxy;


import com.yangweiyao.pattern.proxy.GumballMachine;
import com.yangweiyao.pattern.proxy.GumballMonitor;

import java.rmi.Naming;

/**
 * @Author yangweiyao
 * @CreateTime 2023-04-13 08:17
 * @Description
 **/
public class GumballMachineTestDrive {

    public static void main(String[] args) {
        if(args.length < 2) {
            System.exit(1);
        }
        int count = Integer.parseInt(args[1]);
        try {
            GumballMachine gumballMachine = new GumballMachine(count, args[0]);
            Naming.rebind("//" + args[0] + "/gumballMachine", gumballMachine);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
