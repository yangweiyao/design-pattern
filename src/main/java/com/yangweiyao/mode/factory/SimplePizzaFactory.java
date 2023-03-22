package com.yangweiyao.mode.factory;

import com.yangweiyao.mode.factory.common.RelishEnum;
import com.yangweiyao.mode.factory.product.AbstractPizza;
import com.yangweiyao.mode.factory.product.pizza.CheesePizza;
import com.yangweiyao.mode.factory.product.pizza.PepperoniPizza;

/**
 * @Author: yangweiyao
 * @CreateTime: 2023-03-14 08:17
 * @Description 简单工厂，生产不同口味披萨
 **/
public class SimplePizzaFactory {

    public AbstractPizza createPizza(RelishEnum relishEnum) {
        AbstractPizza pizza = null;
        if(RelishEnum.CHEESE == relishEnum) {
            pizza = new CheesePizza();
        } else if(RelishEnum.PEPPERONI == relishEnum) {
            pizza = new PepperoniPizza();
        } else {
            System.out.printf("[%s] not find!", relishEnum.name());
        }
        return pizza;
    }

}
