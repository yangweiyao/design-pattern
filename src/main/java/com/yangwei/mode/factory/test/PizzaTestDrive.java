package com.yangwei.mode.factory.test;

import com.yangwei.mode.factory.common.RelishEnum;
import com.yangwei.mode.factory.product.AbstractPizza;
import com.yangwei.mode.factory.creator.ChicagoPizzaStore;
import com.yangwei.mode.factory.creator.NyPizzaStore;
import com.yangwei.mode.factory.creator.PizzaStore_V2;

/**
 * @Author yangweiyao
 * @CreateTime 2023-03-15 07:55
 * @Description
 **/
public class PizzaTestDrive {

    public static void main(String[] args) {
        // 加盟店
        PizzaStore_V2 chicagoPizzaStore = new ChicagoPizzaStore();
        PizzaStore_V2 nyPizzaStore = new NyPizzaStore();

        // 下单，需要不同店的奶酪味的
//        AbstractPizza chicagoPizza = chicagoPizzaStore.orderPizza(RelishEnum.CHEESE);
//        System.out.printf("%s-取餐\n", chicagoPizza.getName());

        AbstractPizza nyPizza = nyPizzaStore.orderPizza(RelishEnum.CHEESE);
        System.out.printf("%s-取餐\n", nyPizza.getName());

    }

}
