package com.yangweiyao.mode.strategy;

import com.yangweiyao.mode.strategy.behavior.FlyBehavior;
import com.yangweiyao.mode.strategy.behavior.QuackBehavior;

/**
 * 基于标准的OO技术，设计一个鸭子超类Duck
 *
 * <p>
 * v1.0.1版本 模拟鸭子游戏：SimUDuck
 * 需求：游戏中会出现各种鸭子，一边游泳戏水，一边呱呱叫
 * <p>
 *
 * <p>
 * v1.0.2版本 模拟鸭子游戏：SimUDuck
 * 需求：引入创新玩法，希望程序能支持会飞的鸭子
 * 存在问题：每次新增一个新的产品（鸭子），可能都得检查fly()、quack()是否需要覆盖
 * </p>
 *
 */
public abstract class AbstractDuck {

    protected FlyBehavior flyBehavior;
    protected QuackBehavior quackBehavior;


//    /**
//     * @Version v1.0.1
//     * @Description 所有鸭子都会呱呱叫
//     */
//    public void quack() {
//        System.out.println("呱呱呱...");
//    }

    /**
     * @Version v1.0.2
     * @Description 取代v1.0.1版本的quack()，委托给行为类
     */
    public void performQuack() {
        quackBehavior.quack();
    }

    /**
     * @Version v1.0.1
     * @Description 所有鸭子都会游泳
     */
    public void swim() {
        System.out.println("游水中...");
    }

    /**
     * @Version 1.0.1
     * @Description 在屏幕上显示外观，每个鸭子（子类）负责实现自己display()
     */
    public abstract void display();


//    /**
//     * @Version 1.0.2
//     * @Description 支持鸭子会飞
//     */
//    public void fly() {
//        // 存在问题，并不是所有鸭子都能飞，比如橡皮鸭
//        System.out.println("飞翔中...");
//    }

    /**
     * @Version v1.0.2
     * @Description 取代v1.0.2版本的fly()，委托给行为类
     */
    public void performFly() {
        flyBehavior.fly();
    }

    /**
     *
     * @Version v1.0.2
     * @param flyBehavior 飞行策略
     * @Description 动态设定飞行策略
     */
    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    /**
     *
     * @Version v1.0.2
     * @param quackBehavior 叫法策略
     * @Description 动态设定叫法策略
     */
    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
