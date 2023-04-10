package com.yangweiyao.pattern.observe.jdk.test;

import com.yangweiyao.pattern.observe.jdk.WeatherData;
import com.yangweiyao.pattern.observe.jdk.observer.CurrentConditionDisplay;

/**
 * v1.0.2 基于jdk提供的观察者模式实现
 */
public class WeatherStation {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(80, 65.2f, 30.4f);
        weatherData.setMeasurements(80.2f, 65, 30.4f);
        // 退出监听
        currentConditionDisplay.close();
        weatherData.setMeasurements(81, 65, 30.4f);
        weatherData.setMeasurements(80, 64, 30.4f);
        weatherData.setMeasurements(80, 65, 30.4f);
    }

}
