package com.yangweiyao.pattern.strategy.behavior.specific;

import com.yangweiyao.pattern.strategy.behavior.QuackBehavior;

/**
 * 实现鸭子呱呱叫
 */
public class Quack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("呱呱呱...");
    }

}
