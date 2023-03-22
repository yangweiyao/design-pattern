package com.yangweiyao.mode.strategy.behavior.specific;

import com.yangweiyao.mode.strategy.behavior.FlyBehavior;

public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("借助火箭动力飞翔中...");
    }
}
