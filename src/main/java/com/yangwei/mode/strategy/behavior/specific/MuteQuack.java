package com.yangwei.mode.strategy.behavior.specific;

import com.yangwei.mode.strategy.behavior.QuackBehavior;

/**
 * 什么都不用做，不会叫
 */
public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("我不会叫");
    }
}
