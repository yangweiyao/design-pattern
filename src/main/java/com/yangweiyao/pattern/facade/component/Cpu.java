package com.yangweiyao.pattern.facade.component;

/**
 * @Author yangweiyao
 * @CreateTime 2023-03-29 08:04
 * @Description
 **/
public class Cpu {

    public void electrify(){
        System.out.println("cpu启动成功, 开始调度每个线程");
    }

    public void close(){
        System.out.println("cpu停止运行");
    }

}
