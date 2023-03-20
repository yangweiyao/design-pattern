package com.yangwei.mode.factory.creator;

import com.yangwei.mode.factory.NyPizzaIngredientFactory;
import com.yangwei.mode.factory.PizzaIngredientFactory;
import com.yangwei.mode.factory.common.RelishEnum;
import com.yangwei.mode.factory.product.AbstractPizza;
import com.yangwei.mode.factory.product.pizza.NyStyleCheesePizza;
import com.yangwei.mode.factory.product.pizza.NyStylePepperoniPizza;

/**
 * @Author yangweiyao
 * @CreateTime 2023-03-14 17:24
 * @Description 纽约风味-加盟店
 **/
public class NyPizzaStore extends PizzaStore_V2 {

    private final static PizzaIngredientFactory PIZZA_INGREDIENT_FACTORY = new NyPizzaIngredientFactory();

    @Override
    protected AbstractPizza createPizza(RelishEnum relishEnum) {
        AbstractPizza pizza = null;
        switch (relishEnum) {
            case CHEESE:
                pizza = new NyStyleCheesePizza(PIZZA_INGREDIENT_FACTORY);
                break;
            case PEPPERONI:
                pizza = new NyStylePepperoniPizza(PIZZA_INGREDIENT_FACTORY);
                break;
            default:
                System.out.printf("[%s] not find!", relishEnum.name());
        }
        return pizza;
    }

}
