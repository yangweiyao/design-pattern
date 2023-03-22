package com.yangweiyao.mode.factory;

import com.yangwei.mode.factory.product.*;
import com.yangwei.mode.factory.product.ingredient.*;
import com.yangweiyao.mode.factory.product.ingredient.veggies.Garlic;
import com.yangweiyao.mode.factory.product.ingredient.veggies.Mushroom;
import com.yangweiyao.mode.factory.product.ingredient.veggies.Onion;
import com.yangweiyao.mode.factory.product.ingredient.veggies.RedPepper;
import com.yangweiyao.mode.factory.product.*;
import com.yangweiyao.mode.factory.product.ingredient.*;

import java.util.Arrays;
import java.util.List;

/**
 * @Author yangweiyao
 * @CreateTime 2023-03-17 08:11
 * @Description
 **/
public class NyPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public AbstractDough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public AbstractSauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public AbstractCheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public List<AbstractVeggies> createVeggies() {
        return Arrays.asList(new Garlic(), new Onion(), new Mushroom(), new RedPepper());
    }

    @Override
    public AbstractPepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public AbstractClams createClam() {
        return new FreshClams();
    }
}
