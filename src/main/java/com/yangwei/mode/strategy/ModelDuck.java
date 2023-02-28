package com.yangwei.mode.strategy;

import com.yangwei.mode.strategy.behavior.specific.FlyNoWay;
import com.yangwei.mode.strategy.behavior.specific.Quack;

/**
 * v1.0.2 新增模型鸭产品
 */
public class ModelDuck extends AbstractDuck {

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("我是模型鸭 ");
    }
}
