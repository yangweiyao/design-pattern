package com.yangweiyao.pattern.state;

/**
 * @Author yangweiyao
 * @CreateTime 2023-04-13 09:01
 * @Description
 **/
public class WinnerState implements State {

    private final GumballMachine_V2 gumballMachine_v2;

    public WinnerState(GumballMachine_V2 gumballMachine_v2) {
        this.gumballMachine_v2 = gumballMachine_v2;
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
        gumballMachine_v2.releaseBall();
        if(gumballMachine_v2.getCount() == 0) {
            gumballMachine_v2.setState(gumballMachine_v2.getSoldOutState());
        } else {
            gumballMachine_v2.releaseBall();
            gumballMachine_v2.setState(gumballMachine_v2.getCount() > 0 ?
                    gumballMachine_v2.getNoQuarterState() : gumballMachine_v2.getSoldOutState());
        }
    }
}
