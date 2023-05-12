package com.yangweiyao.pattern.composite.observe;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yangweiyao
 * @createTime 2023/05/09 08:09
 * @description
 **/
public class Observable implements QuackObservable {

    private final List<Observer> observerList;

    private final QuackObservable quackObservable;

    public Observable(QuackObservable quackObservable) {
        this.observerList = new ArrayList<>();
        this.quackObservable = quackObservable;
    }

    @Override
    public void registerObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void notifyObserves() {
        for (Observer observer : observerList) {
            observer.update(quackObservable);
        }
    }

}
