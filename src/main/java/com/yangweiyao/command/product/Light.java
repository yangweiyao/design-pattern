package com.yangweiyao.command.product;

/**
 * @Author yangweiyao
 * @CreateTime 2023-03-22 15:56
 * @Description 电灯
 **/
public class Light extends AbstractProduct {


    public Light(String name) {
        super(name);
    }

    @Override
    public void doSomethingByOn(String name) {
        System.out.println("打开" + name + "电灯...");
    }

    @Override
    public void doSomethingByOff(String name) {
        System.out.println("关闭" + name + "电灯...");
    }

}
