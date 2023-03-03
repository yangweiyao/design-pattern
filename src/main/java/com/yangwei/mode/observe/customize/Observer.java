package com.yangwei.mode.observe.customize;

public interface Observer {

    /**
     * 所有观察者都需要实现update方法，
     * 当气象观测值改变时，主题会把这些状态值当作方法的参数，传递给观察者
     * @param temp 温度
     * @param humidity 湿度
     * @param pressure 压强
     */
    void update(float temp, float humidity, float pressure);

}
