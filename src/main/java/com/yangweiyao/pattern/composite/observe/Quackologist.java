package com.yangweiyao.pattern.composite.observe;

/**
 * @author yangweiyao
 * @createTime 2023/05/10 08:34
 * @description
 **/
public class Quackologist implements Observer {

    @Override
    public void update(QuackObservable quackObservable) {
        System.out.println("Quackologist: " + quackObservable + " just quacked.");
    }

}
