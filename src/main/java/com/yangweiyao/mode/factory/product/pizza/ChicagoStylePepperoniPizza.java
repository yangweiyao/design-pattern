package com.yangweiyao.mode.factory.product.pizza;

import com.yangweiyao.mode.factory.PizzaIngredientFactory;
import com.yangweiyao.mode.factory.product.AbstractPizza;

/**
 * @Author yangweiyao
 * @CreateTime 2023-03-14 17:32
 * @Description
 **/
public class ChicagoStylePepperoniPizza extends AbstractPizza {

    public ChicagoStylePepperoniPizza() {
        this.name = "芝加哥意大利味披萨";
        this.dough = "硬面团";
        this.sauce = "甜面酱";
        this.toppings.add("榴莲");
        this.toppings.add("酸奶");
    }

    public ChicagoStylePepperoniPizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.name = "芝加哥意大利味披萨";
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

}
