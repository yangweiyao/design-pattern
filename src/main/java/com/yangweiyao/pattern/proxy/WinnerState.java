package com.yangweiyao.pattern.proxy;

import com.yangweiyao.pattern.proxy.GumballMachine;
import com.yangweiyao.pattern.proxy.State;

/**
 * @Author yangweiyao
 * @CreateTime 2023-04-13 09:01
 * @Description
 **/
public class WinnerState implements State {

    private final transient GumballMachine gumballMachine_;

    public WinnerState(GumballMachine gumballMachine_) {
        this.gumballMachine_ = gumballMachine_;
    }

    @Override
    public void insertQuarter() {
        // 啥也不干
    }

    @Override
    public void ejectQuarter() {
        // 啥也不干
    }

    @Override
    public void turnCrank() {
        // 啥也不干
    }

    @Override
    public void dispense() {
        System.out.println("恭喜你，幸运儿，你可以得到两个糖果！");
        gumballMachine_.releaseBall();
        if(gumballMachine_.getCount() == 0) {
            gumballMachine_.setState(gumballMachine_.getSoldOutState());
        } else {
            gumballMachine_.releaseBall();
            gumballMachine_.setState(gumballMachine_.getCount() > 0 ?
                    gumballMachine_.getNoQuarterState() : gumballMachine_.getSoldOutState());
        }
    }
}
