package com.yangwei.mode.strategy.behavior.specific;

import com.yangwei.mode.strategy.behavior.QuackBehavior;

/**
 * 实现鸭子吱吱叫
 */
public class Squeak implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("吱吱吱...");
    }

}
