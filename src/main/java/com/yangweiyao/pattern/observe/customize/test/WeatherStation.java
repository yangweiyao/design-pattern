package com.yangweiyao.pattern.observe.customize.test;

import com.yangweiyao.pattern.observe.customize.WeatherData;
import com.yangweiyao.pattern.observe.customize.observer.CurrentConditionDisplay;

public class WeatherStation {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        weatherData.setMeasurements(80, 65, 30.4f);
    }

}
