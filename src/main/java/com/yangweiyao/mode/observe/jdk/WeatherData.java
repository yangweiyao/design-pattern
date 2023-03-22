package com.yangweiyao.mode.observe.jdk;

import java.util.HashMap;
import java.util.Map;
import java.util.Observable;

/**
 *
 * v1.0.2 基于jdk提供的观察者模式实现
 * Observable帮我们管理注册/删除观察者
 */
public class WeatherData extends Observable {

    private float temperature;
    private float humidity;
    private float pressure;

    // 缓存上一次测试值
    private static final Map<String, Float> CACHE = new HashMap<>();

    public WeatherData() {
        // 构造器不再需要为了记住观察者们而建立数据结构
    }

    public void measurementsChanged() {
        // 通知给每个观察者
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
        cache();
        measurementsChanged();
    }

    /**
     * 缓存上一次测试值
     */
    public void cache() {
        Float oldTemperature = CACHE.get("temperature");
        Float oldHumidity = CACHE.get("humidity");
        if(oldTemperature == null || oldHumidity == null
                || Math.abs(temperature - oldTemperature) >= 1 || Math.abs(humidity - oldHumidity) >= 1) {
            // 只有当上一次温度/湿度差异超过1度更新状态
            setChanged();
            CACHE.put("temperature", temperature);
            CACHE.put("humidity", humidity);
            CACHE.put("pressure", pressure);
        }
    }

    /**
     * @Version v1.0.2
     * @Description 气象站取得测量值-温度
     * @return 温度
     */
    public float getTemperature() {
        return temperature;
    }

    /**
     * @Version v1.0.2
     * @Description 气象站取得测量值-湿度
     * @return 湿度
     */
    public float getHumidity() {
        return humidity;
    }

    /**
     * @Version v1.0.2
     * @Description 气象站取得测量值-气压
     * @return 气压
     */
    public float getPressure() {
        return pressure;
    }

}
