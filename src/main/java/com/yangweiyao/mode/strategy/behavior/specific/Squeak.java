package com.yangweiyao.mode.strategy.behavior.specific;

import com.yangweiyao.mode.strategy.behavior.QuackBehavior;

/**
 * 实现鸭子吱吱叫
 */
public class Squeak implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("吱吱吱...");
    }

}
