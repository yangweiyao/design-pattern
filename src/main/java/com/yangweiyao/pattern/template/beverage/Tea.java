package com.yangweiyao.pattern.template.beverage;

import com.yangweiyao.pattern.template.AbstractCaffeineBeverage;

/**
 * @Author yangweiyao
 * @CreateTime 2023-03-30 08:15
 * @Description
 **/
public class Tea extends AbstractCaffeineBeverage {

    @Override
    protected void enquire() {
        System.out.println("请问你的茶需要添加调料吗？调料有柠檬汁");
    }

    @Override
    protected void addCondiments() {
        System.out.println("添加柠檬汁");
    }

    @Override
    protected void brew() {
        System.out.println("茶叶倒入热水浸泡一会");
    }
}
