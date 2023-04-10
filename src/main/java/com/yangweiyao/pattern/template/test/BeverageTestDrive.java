package com.yangweiyao.pattern.template.test;

import com.yangweiyao.pattern.template.AbstractCaffeineBeverage;
import com.yangweiyao.pattern.template.beverage.Coffee;
import com.yangweiyao.pattern.template.beverage.Tea;

/**
 * @Author yangweiyao
 * @CreateTime 2023-03-30 08:31
 * @Description
 **/
public class BeverageTestDrive {

    public static void main(String[] args) {
        System.out.println("====== 制作一杯茶 ======");
        AbstractCaffeineBeverage tea = new Tea();
        tea.prepareRecipe();

        System.out.println("\n====== 制作一杯咖啡 ======");
        AbstractCaffeineBeverage coffee = new Coffee();
        coffee.prepareRecipe();
    }

}
