package com.yangwei.mode.factory.creator;

import com.yangwei.mode.factory.SimplePizzaFactory;
import com.yangwei.mode.factory.common.RelishEnum;
import com.yangwei.mode.factory.product.AbstractPizza;

/**
 * @Author yangweiyao
 * @CreateTime 2023-03-14 08:42
 * @Description 普通的披萨店，由工厂代生产不同口味的披萨
 **/
public class PizzaStore_V1 {

    private final SimplePizzaFactory simplePizzaFactory;

    public PizzaStore_V1(SimplePizzaFactory simplePizzaFactory) {
        this.simplePizzaFactory = simplePizzaFactory;
    }

    public AbstractPizza orderPizza(RelishEnum relishEnum) {
        AbstractPizza pizza = simplePizzaFactory.createPizza(relishEnum);
        if(pizza != null) {
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        }
        return pizza;
    }

    public SimplePizzaFactory getSimplePizzaFactory() {
        return simplePizzaFactory;
    }
}
