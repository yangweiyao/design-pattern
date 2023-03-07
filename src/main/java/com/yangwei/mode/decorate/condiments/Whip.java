package com.yangwei.mode.decorate.condiments;

import com.yangwei.mode.decorate.Beverage;
import com.yangwei.mode.decorate.CondimentDecorator;

/**
 * @Version v1.0.2
 * @Description 配料：奶泡
 */
public class Whip extends CondimentDecorator {

    private final Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return 1 + beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }
}
