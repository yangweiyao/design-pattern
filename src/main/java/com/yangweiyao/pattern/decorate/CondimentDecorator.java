package com.yangweiyao.pattern.decorate;

/**
 * 1. CondimentDecorator要扩展Beverage，需继承
 */
public abstract class CondimentDecorator extends Beverage {

    /**
     * 所有的调料装饰者都必须重新实现getDescription()
     * @return 商品描述
     */
    public abstract String getDescription();

}
