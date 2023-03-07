package com.yangwei.mode.decorate.test;

import com.yangwei.mode.decorate.Beverage;
import com.yangwei.mode.decorate.beverages.Espresso;
import com.yangwei.mode.decorate.condiments.MoCha;
import com.yangwei.mode.decorate.condiments.Soy;
import com.yangwei.mode.decorate.condiments.Whip;

public class StarBuzzCoffee {

    public static void main(String[] args) {
        // 订一杯浓缩咖啡，不需要配料
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        // 装饰者通常是用其他类似与工厂或生成器这样的模式创建的
        // 加点摩卡
        beverage = new MoCha(beverage);
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        // 加点豆浆
        beverage = new Soy(beverage);
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        // 加点奶泡
        beverage = new Whip(beverage);
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

    }

}
