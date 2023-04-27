package com.yangweiyao.pattern.proxy.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * @Author yangweiyao
 * @CreateTime 2023-04-19 08:02
 * @Description
 *
 * 需在当前类的目录下单独javac MyRemote.java编译，然后在当前类的目录新建com.yangweiyao.pattern.proxy.rmi，
 * （注：com.yangweiyao.pattern.proxy.rmi， 当前编译的类在哪个包，对应新的目录名也对应这个包名）
 * 将编译的MyRemote.class文件剪切到上面新建的com.yangweiyao.pattern.proxy.rmi下
 *
 **/
public interface MyRemote extends Remote {

    String sayHello() throws RemoteException;

}
