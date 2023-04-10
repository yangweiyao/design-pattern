package com.yangweiyao.pattern.adapter.animal;

import com.yangweiyao.pattern.adapter.Duck;

/**
 * @Author yangweiyao
 * @CreateTime 2023-03-28 08:06
 * @Description 绿头鸭
 **/
public class MallardDuck implements Duck {

    @Override
    public void quack() {
        System.out.println("嘎嘎嘎...");
    }

    @Override
    public void fly() {
        System.out.println("我会飞");
    }

}
