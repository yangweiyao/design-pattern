package com.yangweiyao.mode.decorate.condiments;

import com.yangweiyao.mode.decorate.Beverage;
import com.yangweiyao.mode.decorate.CondimentDecorator;

/**
 * @Version v1.0.2
 * @Description 配料：摩卡
 */
public class MoCha extends CondimentDecorator {

    private final Beverage beverage;

    public MoCha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return 2.0 + beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }
}
