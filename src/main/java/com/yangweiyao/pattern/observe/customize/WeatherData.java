package com.yangweiyao.pattern.observe.customize;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * 前言：
 * 此系统分为三部分是气象站（获取实际气象数据的物理装置）、
 * WeatherData对象（追踪来自气象站的数据，并更新布告板）和布告板（显示目前天气状况给用户看）
 * </p>
 *
 * <p>
 * v.1.0.1版本
 * 需求：利用WeatherData对象取得的数据，并更新三个布告板：目前状况、气象统计和天气预报<br>
 * 布告板显示：
 * 1）目前状况：温度、湿度、气压
 * 2）气象统计：平均温度、最低温度、最高温度
 * 3）天气预报：（多云、小雨、晴朗等）
 * 设计：采用了自定义的观察者模式实现
 * </p>
 *
 */
public class WeatherData implements Subject {

    private final List<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int i = observers.indexOf(observer);
        if(i >= 0) {
            observers.remove(i);
        }
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature, humidity, pressure);
        }
    }


    /**
     * @Version v1.0.1
     * @Description 气象站取得测量值-温度
     * @return 温度
     */
    public float getTemperature() {
        return temperature;
    }

    /**
     * @Version v1.0.1
     * @Description 气象站取得测量值-湿度
     * @return 湿度
     */
    public float getHumidity() {
        return humidity;
    }

    /**
     * @Version v1.0.1
     * @Description 气象站取得测量值-气压
     * @return 气压
     */
    public float getPressure() {
        return pressure;
    }

    /**
     * @Version v1.0.1
     * @Description 一旦气象站测量更新，这个方法就会被调用
     */
    public void measurementsChanged() {
        // TODO 根据v1.0.1需求，我们负责实现更新布告板信息
        notifyObservers();
    }

    /**
     * 追踪来自气象站的数据
     * @param temperature 温度
     * @param humidity 湿度
     * @param pressure 压强
     */
    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

}
