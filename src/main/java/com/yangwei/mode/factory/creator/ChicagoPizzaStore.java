package com.yangwei.mode.factory.creator;

import com.yangwei.mode.factory.common.RelishEnum;
import com.yangwei.mode.factory.product.AbstractPizza;
import com.yangwei.mode.factory.product.pizza.ChicagoStyleCheesePizza;
import com.yangwei.mode.factory.product.pizza.ChicagoStylePepperoniPizza;

/**
 * @Author yangweiyao
 * @CreateTime 2023-03-14 17:31
 * @Description 芝加哥风味-加盟店
 **/
public class ChicagoPizzaStore extends PizzaStore_V2 {

    @Override
    protected AbstractPizza createPizza(RelishEnum relishEnum) {
        AbstractPizza pizza = null;
        switch (relishEnum) {
            case CHEESE:
                pizza = new ChicagoStyleCheesePizza();
                break;
            case PEPPERONI:
                pizza = new ChicagoStylePepperoniPizza();
                break;
            default:
                System.out.printf("[%s] not find!", relishEnum.name());
        }
        return pizza;
    }

}
