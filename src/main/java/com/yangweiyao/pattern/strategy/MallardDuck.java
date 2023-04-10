package com.yangweiyao.pattern.strategy;

import com.yangweiyao.pattern.strategy.behavior.specific.FlyWithWings;
import com.yangweiyao.pattern.strategy.behavior.specific.Quack;

/**
 * 绿头鸭
 */
public class MallardDuck extends AbstractDuck {

    public MallardDuck() {
        // 这里存在问题，实际不应该制造一个具体的AbstractDuck实现类的实例
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("我是绿头鸭");
    }

}
