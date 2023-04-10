package com.yangweiyao.pattern.strategy;

import com.yangweiyao.pattern.strategy.behavior.specific.FlyNoWay;
import com.yangweiyao.pattern.strategy.behavior.specific.Quack;

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
