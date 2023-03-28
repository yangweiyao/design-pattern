package com.yangweiyao.mode.adapter.support;

import com.yangweiyao.mode.adapter.Duck;
import com.yangweiyao.mode.adapter.Turkey;

/**
 * @Author yangweiyao
 * @CreateTime 2023-03-28 08:13
 * @Description 适配器模式：将一个类的接口，转换成客户期望的另一个接口，让原本接口不兼容的类可以合作无间
 **/
public class TurkeyAdapter implements Duck {

    private final Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }


    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        for (int i = 0; i < 5; i++) {
            // 需要连续调用五次火鸡的飞行才能达到鸭子完整的飞行距离
            turkey.fly();
        }

    }

    public Turkey getTurkey() {
        return turkey;
    }
}
