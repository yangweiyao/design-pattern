package com.yangweiyao.mode.strategy.behavior.specific;

import com.yangweiyao.mode.strategy.behavior.FlyBehavior;

/**
 * 什么都不用做，不会飞
 */
public class FlyNoWay implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("我不会飞...");
    }

}
