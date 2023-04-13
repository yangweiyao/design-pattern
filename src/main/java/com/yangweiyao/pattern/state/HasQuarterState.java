package com.yangweiyao.pattern.state;

import java.util.Random;

/**
 * @Author yangweiyao
 * @CreateTime 2023-04-13 09:01
 * @Description
 **/
public class HasQuarterState implements State {

    private final Random randomWinner;
    private final GumballMachine_V2 gumballMachine_v2;

    public HasQuarterState(GumballMachine_V2 gumballMachine_v2) {
        randomWinner = new Random(System.currentTimeMillis());
        this.gumballMachine_v2 = gumballMachine_v2;
    }

    @Override
    public void insertQuarter() {
        System.out.println("你已经投过币了, 无需再投");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("退币成功：系统自动退币");
        gumballMachine_v2.setState(gumballMachine_v2.getNoQuarterState());
    }

    @Override
    public void turnCrank() {
        System.out.println("推动杆子成功：正在自动发放糖果");
        // 推动杆子，计算该顾客是否为赢家 10%概率
        int winner = randomWinner.nextInt(10);
        gumballMachine_v2.setState(winner == 0 && gumballMachine_v2.getCount() > 1 ?
                gumballMachine_v2.getWinnerState() : gumballMachine_v2.getSoldState());
    }

    @Override
    public void dispense() {
        // 啥也不干
    }
}
