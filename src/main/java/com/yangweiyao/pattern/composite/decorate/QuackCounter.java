package com.yangweiyao.pattern.composite.decorate;

import com.yangweiyao.pattern.composite.AbstractDuck;
import com.yangweiyao.pattern.composite.Quackable;

/**
 * @Author yangweiyao
 * @CreateTime 2023-05-05 08:27
 * @Description 通过装饰者统计鸭子的叫声
 **/
public class QuackCounter extends AbstractDuck {

    private final Quackable quackable;
    private static int numberOfQuacks;

    public QuackCounter(Quackable quackable) {
        this.quackable = quackable;
    }

    @Override
    protected void callQuack() {
        quackable.quack();
        numberOfQuacks++;
    }

    public static int getNumberOfQuacks() {
        return numberOfQuacks;
    }

}
