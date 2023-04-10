package com.yangweiyao.pattern.strategy.behavior.specific;

import com.yangweiyao.pattern.strategy.behavior.FlyBehavior;

/**
 * 实现鸭子飞行
 */
public class FlyWithWings implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("飞翔中...");
    }

}
