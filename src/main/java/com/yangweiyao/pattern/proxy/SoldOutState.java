package com.yangweiyao.pattern.proxy;

import com.yangweiyao.pattern.proxy.GumballMachine;
import com.yangweiyao.pattern.proxy.State;

/**
 * @Author yangweiyao
 * @CreateTime 2023-04-13 09:01
 * @Description
 **/
public class SoldOutState implements State {

    private final transient GumballMachine gumballMachine_;

    public SoldOutState(GumballMachine gumballMachine_) {
        this.gumballMachine_ = gumballMachine_;
    }

    @Override
    public void insertQuarter() {
        System.out.println("投币失败：糖果已售罄, 系统自动退币");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("退币失败：未投过币");
    }

    @Override
    public void turnCrank() {
        System.out.println("推动杆子失败：糖果已售罄");
    }

    @Override
    public void dispense() {
        // 啥也不干
    }

    public GumballMachine getGumballMachine_v2() {
        return gumballMachine_;
    }
}
