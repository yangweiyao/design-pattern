package com.yangweiyao.pattern.composite.test;

import com.yangweiyao.pattern.composite.AbstractDuckFactory;
import com.yangweiyao.pattern.composite.Flock;
import com.yangweiyao.pattern.composite.Quackable;
import com.yangweiyao.pattern.composite.adapter.GooseAdapter;
import com.yangweiyao.pattern.composite.animal.Goose;
import com.yangweiyao.pattern.composite.animal.MallardDuck;
import com.yangweiyao.pattern.composite.animal.ReaHeadDuck;
import com.yangweiyao.pattern.composite.decorate.QuackCounter;
import com.yangweiyao.pattern.composite.factory.CountingDuckFactory;
import com.yangweiyao.pattern.composite.factory.DuckFactory;
import com.yangweiyao.pattern.composite.observe.Quackologist;

/**
 * @Author yangweiyao
 * @CreateTime 2023-05-05 08:19
 * @Description
 **/
public class DuckSimulator {

    public static void main(String[] args) {
        DuckSimulator duckSimulator = new DuckSimulator();
        duckSimulator.simulate();
    }

    void simulate() {

        // 工厂模式、装饰者模式
        AbstractDuckFactory duckFactory = new DuckFactory();
        Quackable mallardDuck = duckFactory.createDuck(MallardDuck.class);
        Quackable reaHeadDuck = duckFactory.createDuck(ReaHeadDuck.class);

        // 适配器模式
        Quackable gooseDuck = new GooseAdapter(new Goose());

        // 组合模式
        Flock flock = new Flock(2);
        flock.add(mallardDuck);
        flock.add(reaHeadDuck);

        Quackologist quackologist = new Quackologist();
        flock.registerObserver(quackologist);

        simulate(flock);
        simulate(gooseDuck);

        System.out.println("The ducks quacked " + QuackCounter.getNumberOfQuacks() + " times");

    }

    void simulate(Quackable quackable) {
        quackable.quack();
    }


}
