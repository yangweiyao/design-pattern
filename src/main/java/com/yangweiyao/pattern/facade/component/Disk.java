package com.yangweiyao.pattern.facade.component;

/**
 * @Author yangweiyao
 * @CreateTime 2023-03-29 08:04
 * @Description 固态
 **/
public class Disk {

    public void electrify(){
        System.out.println("固态SD启动成功, 正常读写系统内容");
    }

    public void close(){
        System.out.println("固态SD停止运行");
    }

}
