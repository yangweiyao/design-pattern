package com.yangweiyao.pattern.state;

/**
 * @Author yangweiyao
 * @CreateTime 2023-04-13 09:01
 * @Description
 **/
public class NoQuarterState implements State {

    private final GumballMachine_V2 gumballMachine_v2;

    public NoQuarterState(GumballMachine_V2 gumballMachine_v2) {
        this.gumballMachine_v2 = gumballMachine_v2;
    }

    @Override
    public void insertQuarter() {
        System.out.println("投币成功, 推动杆子就可以得到糖果啦");
        gumballMachine_v2.setState(gumballMachine_v2.getHasQuarterState());
    }

    @Override
    public void ejectQuarter() {
        System.out.println("退币失败：未投过币");
    }

    @Override
    public void turnCrank() {
        System.out.println("推动杆子失败：还未投过币");
    }

    @Override
    public void dispense() {
        // 啥也不干
    }
}
