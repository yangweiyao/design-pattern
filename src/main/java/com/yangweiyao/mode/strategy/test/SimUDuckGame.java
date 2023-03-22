package com.yangweiyao.mode.strategy.test;

import com.yangweiyao.mode.strategy.*;
import com.yangweiyao.mode.strategy.behavior.specific.FlyRocketPowered;

/**
 * SimUDuckGame界面
 */
public class SimUDuckGame {

    public static void main(String[] args) {
        AbstractDuck decoyDuck = new DecoyDuck();
        decoyDuck.display();
        decoyDuck.performFly();
        decoyDuck.swim();
        decoyDuck.performQuack();
        System.out.println("===========================");

        AbstractDuck mallardDuck = new MallardDuck();
        mallardDuck.display();
        mallardDuck.performFly();
        mallardDuck.swim();
        mallardDuck.performQuack();
        System.out.println("===========================");

        AbstractDuck redHeadDuck = new RedHeadDuck();
        redHeadDuck.display();
        redHeadDuck.performFly();
        redHeadDuck.swim();
        redHeadDuck.performQuack();
        System.out.println("===========================");

        AbstractDuck rubberDuck = new RubberDuck();
        rubberDuck.display();
        rubberDuck.performFly();
        rubberDuck.swim();
        rubberDuck.performQuack();
        System.out.println("===========================");

        AbstractDuck modelDuck = new ModelDuck();
        modelDuck.display();
        modelDuck.performFly();
        modelDuck.swim();
        modelDuck.performQuack();
        // 借助火箭让modelDuck也飞起来
        modelDuck.setFlyBehavior(new FlyRocketPowered());
        modelDuck.performFly();
        System.out.println("===========================");

    }

}
