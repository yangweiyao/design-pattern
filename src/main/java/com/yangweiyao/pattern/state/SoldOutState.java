package com.yangweiyao.pattern.state;

/**
 * @Author yangweiyao
 * @CreateTime 2023-04-13 09:01
 * @Description
 **/
public class SoldOutState implements State {

    private final GumballMachine_V2 gumballMachine_v2;

    public SoldOutState(GumballMachine_V2 gumballMachine_v2) {
        this.gumballMachine_v2 = gumballMachine_v2;
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

    public GumballMachine_V2 getGumballMachine_v2() {
        return gumballMachine_v2;
    }
}
