package com.yangweiyao.pattern.composite.observe;


/**
 * @author yangweiyao
 */
public interface QuackObservable {

    /**
     * 注册观察者
     * @param observer 观察者
     */
    void registerObserver(Observer observer);

    /**
     * 通知所有观察者
     */
    void notifyObserves();

}
