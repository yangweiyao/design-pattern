package com.yangweiyao.pattern.composite;

import com.yangweiyao.pattern.composite.observe.Observer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Author yangweiyao
 * @CreateTime 2023-05-06 08:18
 * @Description
 **/
public class Flock implements Quackable {

    private final List<Quackable> quackables;

    public Flock(int initialCapacity) {
        quackables = new ArrayList<>(initialCapacity);
    }

    public void add(Quackable quackable) {
        quackables.add(quackable);
    }

    @Override
    public void quack() {
        quackables.forEach(Quackable::quack);
    }

    @Override
    public void registerObserver(Observer observer) {
        for (Quackable next : quackables) {
            next.registerObserver(observer);
        }
    }

    @Override
    public void notifyObserves() {

    }
}
