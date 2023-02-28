package com.yangwei.mode.strategy;

import com.yangwei.mode.strategy.behavior.specific.FlyNoWay;
import com.yangwei.mode.strategy.behavior.specific.MuteQuack;

/**
 * 木头假鸭，不会飞也不会叫
 */
public class DecoyDuck extends AbstractDuck {

//    @Override
//    public void quack() {
//        // 覆盖分类方法，什么都不做
//    }

    public DecoyDuck() {
        // 这里存在问题，实际不应该制造一个具体的AbstractDuck实现类的实例
        flyBehavior = new FlyNoWay();
        quackBehavior = new MuteQuack();
    }

    @Override
    public void display() {
        System.out.println("我是木头假鸭");
    }

//    @Override
//    public void fly() {
//        // 覆盖分类方法，什么都不做
//    }
}
