package com.yangweiyao.pattern.proxy;

import com.yangweiyao.pattern.proxy.GumballMachine;
import com.yangweiyao.pattern.proxy.State;

/**
 * @Author yangweiyao
 * @CreateTime 2023-04-13 08:57
 * @Description
 **/
public class SoldState implements State {

    private final transient GumballMachine gumballMachine_;

    public SoldState(GumballMachine gumballMachine_) {
        this.gumballMachine_ = gumballMachine_;
    }

    @Override
    public void insertQuarter() {
        System.out.println("投币失败：系统正在发放糖果, 系统自动退币");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("退币失败, 你已经转过杆了");
    }

    @Override
    public void turnCrank() {
        System.out.println("推动杆子失败：请稍等, 系统正在发放糖果");
    }

    @Override
    public void dispense() {
        gumballMachine_.releaseBall();
        gumballMachine_.setState(gumballMachine_.getCount() > 0 ?
                gumballMachine_.getNoQuarterState() : gumballMachine_.getSoldOutState());
    }

    public GumballMachine getGumballMachine_v2() {
        return gumballMachine_;
    }
}
