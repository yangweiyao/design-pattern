package com.yangweiyao.mode.observe.jdk.observer;

import com.yangweiyao.mode.observe.customize.DisplayElement;
import com.yangweiyao.mode.observe.jdk.WeatherData;

import java.util.Observable;
import java.util.Observer;

/**
 * v1.0.2 基于jdk提供的观察者模式实现
 */
public class CurrentConditionDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;
    private final Observable observable;

    public CurrentConditionDisplay(Observable observable) {
        this.observable = observable;
        // 登记CurrentConditionDisplay为观察者
        observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current Condition: " + temperature + "F degrees and " + humidity + "% humidity");
    }

    public void close() {
        observable.deleteObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }

}
