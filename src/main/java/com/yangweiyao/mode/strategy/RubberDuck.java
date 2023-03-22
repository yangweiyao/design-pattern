package com.yangweiyao.mode.strategy;

import com.yangweiyao.mode.strategy.behavior.specific.FlyNoWay;
import com.yangweiyao.mode.strategy.behavior.specific.Squeak;

/**
 * 橡皮鸭
 */
public class RubberDuck extends AbstractDuck {

//    @Override
//    public void quack() {
//        // 橡皮鸭不会呱呱叫，覆盖父类方法改成吱吱叫
//        System.out.println("吱吱吱...");
//    }

    public RubberDuck() {
        // 这里存在问题，实际不应该制造一个具体的AbstractDuck实现类的实例
        flyBehavior = new FlyNoWay();
        quackBehavior = new Squeak();
    }

    @Override
    public void display() {
        System.out.println("我是橡皮鸭");
    }

//    @Override
//    public void fly() {
//        // 由于橡皮鸭不会飞，覆盖分类方法，什么都不做
//    }
}
