package com.yangweiyao.pattern.proxy;

import com.yangweiyao.pattern.proxy.GumballMachine;
import com.yangweiyao.pattern.proxy.State;

import java.util.Random;

/**
 * @Author yangweiyao
 * @CreateTime 2023-04-13 09:01
 * @Description
 **/
public class HasQuarterState implements State {

    private final Random randomWinner;
    private final transient GumballMachine gumballMachine_;

    public HasQuarterState(GumballMachine gumballMachine_) {
        randomWinner = new Random(System.currentTimeMillis());
        this.gumballMachine_ = gumballMachine_;
    }

    @Override
    public void insertQuarter() {
        System.out.println("你已经投过币了, 无需再投");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("退币成功：系统自动退币");
        gumballMachine_.setState(gumballMachine_.getNoQuarterState());
    }

    @Override
    public void turnCrank() {
        System.out.println("推动杆子成功：正在自动发放糖果");
        // 推动杆子，计算该顾客是否为赢家 10%概率
        int winner = randomWinner.nextInt(10);
        gumballMachine_.setState(winner == 0 && gumballMachine_.getCount() > 1 ?
                gumballMachine_.getWinnerState() : gumballMachine_.getSoldState());
    }

    @Override
    public void dispense() {
        // 啥也不干
    }
}
