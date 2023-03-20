package com.yangwei.mode.factory.product;

import com.yangwei.mode.factory.PizzaIngredientFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: yangweiyao
 * @CreateTime: 2023-03-14 08:19
 **/
public abstract class AbstractPizza {

    protected String name; // 披萨名
    protected String dough; // 面团类型
    protected String sauce; // 酱料类型
    protected List<String> toppings = new ArrayList<>(); // 佐料
//
//    protected AbstractPizza(){}
//
//    protected AbstractPizza(String name, String dough, String sauce) {
//        this.name = name;
//        this.dough = dough;
//        this.sauce = sauce;
//    }

    /**
     * 由于加盟店使用的原料偷工减料，所以我们统一定义一个原料工厂，不同风格原料有对应的工厂去生产原料
     */
    protected PizzaIngredientFactory pizzaIngredientFactory;

    public AbstractPizza() {}

    public AbstractPizza(String name, PizzaIngredientFactory pizzaIngredientFactory) {
        this.name = name;
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    /**
     * 准备
     */
    public void prepare() {
//        System.out.println(name + "-准备中");
//        StringBuilder builder = new StringBuilder();
//        toppings.forEach(t -> builder.append(t).append(", "));
//        System.out.printf("面团类型：%s, 酱料类型：%s, 佐料：%s\n", dough, sauce, builder.substring(0, builder.length() - 2));

        System.out.println(name + "-准备中");
        System.out.printf("面团类型：%s, 酱料类型：%s, 奶酪：%s, 腊肠：%s, 蛤蜊：%s, 佐料：%s\n",
                pizzaIngredientFactory.createDough(), pizzaIngredientFactory.createSauce(), pizzaIngredientFactory.createCheese(),
                pizzaIngredientFactory.createPepperoni(), pizzaIngredientFactory.createClam(), Arrays.toString(pizzaIngredientFactory.createVeggies().toArray()));

    }

    /**
     * 烘烤
     */
    public void bake() {
        System.out.println("烘烤中...");
    }

    /**
     * 切片
     */
    public void cut() {
        System.out.println("自动切片中...");
    }

    /**
     * 包装
     */
    public void box() {
        System.out.println("打包中...");
    }


    public String getName() {
        return name;
    }

    public String getDough() {
        return dough;
    }

    public String getSauce() {
        return sauce;
    }

    public List<String> getToppings() {
        return toppings;
    }
}
