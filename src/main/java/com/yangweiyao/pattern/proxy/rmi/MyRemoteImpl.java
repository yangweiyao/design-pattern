package com.yangweiyao.pattern.proxy.rmi;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.UUID;

/**
 * @Author yangweiyao
 * @CreateTime 2023-04-19 08:03
 * @Description 远程服务
 *
 * 操作教程：（如果执行main报错可考虑执行此操作教程）
 * @see com.yangweiyao.pattern.proxy.rmi.MyRemote
 * 然后执行rmic com.yangweiyao.pattern.proxy.rmi.MyRemoteImpl
 * 在当前类的目录下执行rmiregistry，rmiregistry会从classpath（即新建目录存放的.class）下寻找_Stub结尾的文件
 * 最后执行java com.yangweiyao.pattern.proxy.rmi.MyRemoteImpl 或 idea执行main方法
 *
 **/
public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {

    public MyRemoteImpl() throws RemoteException {}

    @Override
    public String sayHello() throws RemoteException {
        return UUID.randomUUID().toString();
    }

    /**
     * 注意：执行方法前需在com.yangweiyao.pattern.proxy.rmi下执行rmiregistry
     */
    public static void main(String[] args) {
        try {
            MyRemote remote = new MyRemoteImpl();
            String serviceName = "RemoteHello";
            System.out.println("开始注册rmi, serviceName：" + serviceName);
            Naming.rebind(serviceName, remote);
            System.out.println("注册rmi成功, serviceName：" + serviceName);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
