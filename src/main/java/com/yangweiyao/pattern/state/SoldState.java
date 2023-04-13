package com.yangweiyao.pattern.state;

/**
 * @Author yangweiyao
 * @CreateTime 2023-04-13 08:57
 * @Description
 **/
public class SoldState implements State {

    private final GumballMachine_V2 gumballMachine_v2;

    public SoldState(GumballMachine_V2 gumballMachine_v2) {
        this.gumballMachine_v2 = gumballMachine_v2;
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
        gumballMachine_v2.releaseBall();
        gumballMachine_v2.setState(gumballMachine_v2.getCount() > 0 ?
                gumballMachine_v2.getNoQuarterState() : gumballMachine_v2.getSoldOutState());
    }

    public GumballMachine_V2 getGumballMachine_v2() {
        return gumballMachine_v2;
    }
}
