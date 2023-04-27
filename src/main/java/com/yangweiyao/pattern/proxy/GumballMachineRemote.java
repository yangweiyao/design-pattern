package com.yangweiyao.pattern.proxy;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * @Author yangweiyao
 * @CreateTime 2023-04-20 08:06
 * @Description
 **/
public interface GumballMachineRemote extends Remote {

    int getCount() throws RemoteException;

    String getLocation() throws RemoteException;

    State getState() throws RemoteException;

}
