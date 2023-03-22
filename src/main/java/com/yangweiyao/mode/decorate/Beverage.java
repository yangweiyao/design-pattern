package com.yangweiyao.mode.decorate;

/**
 * <p>
 * v1.0.1版本 饮料有不同口味，并且有对应的商品名（例如：咖啡）
 * v1.0.2版本 饮料可以加上各种调料（例如：燕奶、豆浆、摩卡等），
 * 然后计算出不同价钱返回，并且有对应新的商品名（例如：双倍摩卡豆浆奶泡拿铁咖啡）<br>
 * v1.0.3版本 支持不同容量大小，例如（小杯、中杯、大杯） 对应加收（1
 * 设计模式-装饰者模式 （开放-关闭原则）
 * </p>
 */
public abstract class Beverage {

    protected String description;

    /**
     * @Version v1.0.1
     * @Description 由子类计算实际价钱
     * @return 实际价钱
     */
    public abstract double cost();

    /**
     * @Version v1.0.1
     * @Description 用来描述饮料，例如：超优深培咖啡豆
     * @return 商品名
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
