package com.yangweiyao.pattern.factory;

import com.yangweiyao.mode.factory.product.*;
import com.yangweiyao.pattern.factory.product.*;

import java.util.List;

/**
 * @Author yangweiyao
 * @CreateTime 2023-03-16 08:04
 * @Description 建立原料工厂(抽象工厂, 用于创建原料[产品])
 **/
public interface PizzaIngredientFactory {

    AbstractDough createDough();

    AbstractSauce createSauce();

    AbstractCheese createCheese();

    List<AbstractVeggies> createVeggies();

    AbstractPepperoni createPepperoni();

    AbstractClams createClam();

}
