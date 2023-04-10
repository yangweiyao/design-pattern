package com.yangweiyao.pattern.factory.product.pizza;

import com.yangweiyao.pattern.factory.PizzaIngredientFactory;
import com.yangweiyao.pattern.factory.product.AbstractPizza;

/**
 * @Author yangweiyao
 * @CreateTime 2023-03-14 17:30
 * @Description
 **/
public class ChicagoStyleCheesePizza extends AbstractPizza {
    public ChicagoStyleCheesePizza() {
        this.name = "芝加哥奶酪味披萨";
        this.dough = "软面团";
        this.sauce = "辣面酱";
        this.toppings.add("菠萝");
        this.toppings.add("芝士");
    }

    public ChicagoStyleCheesePizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.name = "芝加哥奶酪味披萨";
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

}
