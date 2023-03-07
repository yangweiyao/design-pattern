package com.yangwei.mode.decorate.condiments;

import com.yangwei.mode.decorate.Beverage;
import com.yangwei.mode.decorate.CondimentDecorator;

/**
 * @Version v1.0.2
 * @Description 配料：豆浆
 */
public class Soy extends CondimentDecorator {

    private final Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return 3.0 + beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }
}
