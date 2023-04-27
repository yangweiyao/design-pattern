package com.yangweiyao.pattern.proxy;

import java.rmi.RemoteException;

/**
 * @Author yangweiyao
 * @CreateTime 2023-04-18 08:08
 * @Description
 **/
public class GumballMonitor {

    private final GumballMachineRemote gumballMachineRemote;

    public GumballMonitor(GumballMachineRemote gumballMachineRemote) {
        this.gumballMachineRemote = gumballMachineRemote;
    }

    public void report() throws RemoteException {
        System.out.println("糖果机：" + gumballMachineRemote.getLocation());
        System.out.println("库存：" + gumballMachineRemote.getCount() + "颗糖果");
        System.out.println("状态：" + gumballMachineRemote.getState());
    }

}
