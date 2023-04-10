package com.yangweiyao.pattern.singleton;

/**
 * @Author yangweiyao
 * @CreateTime 2023-03-20 16:06
 * @Description 饱（懒）汉式单例模式
 **/
public class Singleton2 {

    /**
     * 饱（懒）汉，表示在类加载的时候不需要要创建好实例，只有第一次用的到时候才创建
     */
    private static Singleton2 instance;

    /**
     * 构造器需要私有化，保证外部无法实例化
     */
    private Singleton2() {}

    /**
     * 判断-存在-修改，在多线程存在竞态条件，需要使用同步方法保证线程安全<br>
     * 性能上较差，每次获取实例都得获取锁释放锁
     * @return Singleton3单例
     */
    public static synchronized Singleton2 getInstance() {
        if(instance == null) {
            instance = new Singleton2();
        }
        return instance;
    }

}
