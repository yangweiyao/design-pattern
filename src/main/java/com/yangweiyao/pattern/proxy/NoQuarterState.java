package com.yangweiyao.pattern.proxy;


/**
 * @Author yangweiyao
 * @CreateTime 2023-04-13 09:01
 * @Description
 **/
public class NoQuarterState implements State {

    private final transient GumballMachine gumballMachine_;

    public NoQuarterState(GumballMachine gumballMachine_) {
        this.gumballMachine_ = gumballMachine_;
    }

    @Override
    public void insertQuarter() {
        System.out.println("投币成功, 推动杆子就可以得到糖果啦");
        gumballMachine_.setState(gumballMachine_.getHasQuarterState());
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
