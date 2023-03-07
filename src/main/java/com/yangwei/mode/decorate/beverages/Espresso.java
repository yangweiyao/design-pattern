package com.yangwei.mode.decorate.beverages;

import com.yangwei.mode.decorate.Beverage;

/**
 * @Version v1.0.1
 * 浓缩咖啡
 */
public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 16.9;
    }

}

