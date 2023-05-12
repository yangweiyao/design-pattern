package com.yangweiyao.pattern.composite;

import com.yangweiyao.pattern.composite.observe.Observable;
import com.yangweiyao.pattern.composite.observe.Observer;

/**
 * @author yangweiyao
 * @createTime 2023/05/10 07:58
 * @description
 **/
public abstract class AbstractDuck implements Quackable {

    private final Observable observable;

    public AbstractDuck(){
        this.observable = new Observable(this);
    }

    @Override
    public void quack() {
        callQuack();
        notifyObserves();
    }

    /**
     * 回调叫声
     */
    protected abstract void callQuack();

    @Override
    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    @Override
    public void notifyObserves() {
        observable.notifyObserves();
    }
}
