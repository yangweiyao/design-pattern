package com.yangweiyao.mode.factory.creator;

import com.yangweiyao.mode.factory.common.RelishEnum;
import com.yangweiyao.mode.factory.product.AbstractPizza;

/**
 * @Author yangweiyao
 * @CreateTime 2023-03-14 17:00
 * @Description 披萨店支持加盟，由于文化风俗不同，导致不同店生产的披萨也有点差异
 **/
public abstract class PizzaStore_V2 {

    public AbstractPizza orderPizza(RelishEnum relishEnum) {
        AbstractPizza pizza = createPizza(relishEnum);
        if(pizza != null) {
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        }
        return pizza;
    }

    /**
     * 由于不同店生产的披萨风味不同，则披萨的风格由各自加盟店自己去决定<br>
     * 这里createPizza定义为工厂方法，依赖子类来处理对象的创建<br>
     * @param relishEnum 具体的口味
     * @return 披萨
     */
    protected abstract AbstractPizza createPizza(RelishEnum relishEnum);

}
