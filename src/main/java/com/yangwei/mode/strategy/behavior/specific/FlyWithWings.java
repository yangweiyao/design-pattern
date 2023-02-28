package com.yangwei.mode.strategy.behavior.specific;

import com.yangwei.mode.strategy.behavior.FlyBehavior;

/**
 * 实现鸭子飞行
 */
public class FlyWithWings implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("飞翔中...");
    }

}
