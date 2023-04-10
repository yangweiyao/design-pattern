package com.yangweiyao.pattern.decorate.beverages;

import com.yangweiyao.pattern.decorate.Beverage;

/**
 * @Version v1.0.1
 * 首先咖啡
 */
public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "House Blend Coffee";
    }

    @Override
    public double cost() {
        return 15.9;
    }
}
