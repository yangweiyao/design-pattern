package com.yangweiyao.pattern.composite.animal;

import com.yangweiyao.pattern.composite.AbstractDuck;

/**
 * @Author yangweiyao
 * @CreateTime 2023-05-05 08:17
 * @Description
 **/
public class ReaHeadDuck extends AbstractDuck {
    @Override
    protected void callQuack() {
        System.out.println("ReaHeadDuck quack!");
    }

}
