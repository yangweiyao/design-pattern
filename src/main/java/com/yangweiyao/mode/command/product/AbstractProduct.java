package com.yangweiyao.mode.command.product;

/**
 * @Author yangweiyao
 * @CreateTime 2023-03-22 17:27
 * @Description
 **/
public abstract class AbstractProduct {

    private final String name;

    /** 状态 0：开 1：关 */
    private volatile int status;

    public AbstractProduct(String name) {
        this.name = name;
        status = 1;
    }

    public void on() {
        doSomethingByOn(name);
        status = 0;
    }

    public void off() {
        status = 1;
        doSomethingByOff(name);
    }

    public abstract void doSomethingByOn(String name);

    public abstract void doSomethingByOff(String name);

    public int getStatus() {
        return status;
    }

    public String getName() {
        return name;
    }

}
