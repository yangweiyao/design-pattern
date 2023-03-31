package com.yangweiyao.mode.template.beverage;

import com.yangweiyao.mode.template.AbstractCaffeineBeverage;

/**
 * @Author yangweiyao
 * @CreateTime 2023-03-30 08:15
 * @Description
 **/
public class Coffee extends AbstractCaffeineBeverage {

    @Override
    protected void enquire() {
        System.out.println("请问你的咖啡需要添加调料吗？调料有白砂糖、牛奶");
    }

    @Override
    protected void addCondiments() {
        System.out.println("添加白砂糖、牛奶");
    }

    @Override
    protected void brew() {
        System.out.println("咖啡配合热水压缩过滤");
    }
}
