package com.yangweiyao.pattern.proxy.rmi;

import java.rmi.Naming;
import java.rmi.Remote;

/**
 * @Author yangweiyao
 * @CreateTime 2023-04-19 08:15
 * @Description
 *
 * 操作步骤：
 * @see com.yangweiyao.pattern.proxy.rmi.MyRemote
 * 然后执行java com.yangweiyao.pattern.proxy.rmi.MyRemoteClient 或 idea执行main方法
 *
 **/
public class MyRemoteClient {

    /**
     * 注意：执行main需保证MyRemoteImpl已执行
     * @see com.yangweiyao.pattern.proxy.rmi.MyRemoteImpl
     */
    public static void main(String[] args) {
        new MyRemoteClient().go();
    }

    public void go() {
        try {
            String serviceName = "RemoteHello";
            System.out.printf("开始连接%s服务...\n", serviceName);
            Remote remote = Naming.lookup("rmi://127.0.0.1/" + serviceName);
            MyRemote myRemote = (MyRemote) remote;
            System.out.printf("连接%s服务成功, token: %s\n", serviceName, myRemote.sayHello());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
