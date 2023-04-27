package com.yangweiyao.pattern.proxy;

import com.yangweiyao.pattern.proxy.GumballMachineRemote;
import com.yangweiyao.pattern.proxy.GumballMonitor;

import java.rmi.Naming;

/**
 * @Author yangweiyao
 * @CreateTime 2023-04-20 08:34
 * @Description
 **/
public class GumballMonitorTestDrive {

    public static void main(String[] args) {
        String[] locations = {"rmi://127.0.0.1/gumballMachine",
                "rmi://127.0.0.1/gumballMachine",
                "rmi://127.0.0.1/gumballMachine"};

        GumballMonitor[] monitors = new GumballMonitor[locations.length];

        for (int i = 0; i < locations.length; i++) {
            try {
                GumballMachineRemote machineRemote = (GumballMachineRemote) Naming.lookup(locations[i]);
                monitors[i] = new GumballMonitor(machineRemote);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        for (GumballMonitor monitor : monitors) {
            try {
                monitor.report();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

}
