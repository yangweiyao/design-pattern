package com.yangweiyao.mode.observe.customize;

public interface Subject {

    /**
     * 向主题注册观察者
     * @param observer 观察者
     */
    void registerObserver(Observer observer);

    /**
     * 从主题中移除观察者
     * @param observer 观察者
     */
    void removeObserver(Observer observer);

    /**
     * 当主题状态改变时，这个方法会被调用，以通知所有的观察者
     */
    void notifyObservers();

}
