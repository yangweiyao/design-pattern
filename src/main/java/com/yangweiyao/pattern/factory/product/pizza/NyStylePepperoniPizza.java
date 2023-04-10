package com.yangweiyao.pattern.factory.product.pizza;

import com.yangweiyao.pattern.factory.PizzaIngredientFactory;
import com.yangweiyao.pattern.factory.product.AbstractPizza;

/**
 * @Author yangweiyao
 * @CreateTime 2023-03-14 17:27
 * @Description
 **/
public class NyStylePepperoniPizza extends AbstractPizza {

    public NyStylePepperoniPizza() {
        this.name = "纽约意大利味披萨";
        this.dough = "硬面团";
        this.sauce = "甜面酱";
        this.toppings.add("榴莲");
        this.toppings.add("酸奶");
    }

    public NyStylePepperoniPizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.name = "纽约意大利味披萨";
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

}
