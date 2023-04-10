package com.yangweiyao.pattern.facade.component;

/**
 * @Author yangweiyao
 * @CreateTime 2023-03-29 08:13
 * @Description 电脑主板
 **/
public class MainBoard {

    public void electrify(){
        System.out.println("通电成功, 开始启动每个配件");
    }

    public void close(){
        System.out.println("关闭所有配件运行");
    }

}
