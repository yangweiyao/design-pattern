package com.yangweiyao.pattern.adapter.animal;

import com.yangweiyao.pattern.adapter.Turkey;

/**
 * @Author yangweiyao
 * @CreateTime 2023-03-28 08:08
 * @Description 野生火鸡
 **/
public class WildTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("咯咯咯...");
    }

    @Override
    public void fly() {
        System.out.println("我会飞一段距离");
    }
}
