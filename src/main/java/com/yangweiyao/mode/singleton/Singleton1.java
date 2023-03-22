package com.yangweiyao.mode.singleton;

/**
 * @Author yangweiyao
 * @CreateTime 2023-03-20 16:06
 * @Description 饿汉式单例模式
 **/
public class Singleton1 {

    /**
     * 饿汉，表示在类加载的时候要创建好实例
     */
    private final static Singleton1 instance = new Singleton1();

    /**
     * 构造器需要私有化，保证外部无法实例化
     */
    private Singleton1() {}

    /**
     * @return Singleton3单例
     */
    public static Singleton1 getInstance() {
        return instance;
    }

}
