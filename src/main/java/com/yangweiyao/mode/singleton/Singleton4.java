package com.yangweiyao.mode.singleton;

/**
 * @Author yangweiyao
 * @CreateTime 2023-03-20 16:44
 * @Description 静态内部类单例模式
 **/
public class Singleton4 {

    private Singleton4() {}

    private static final class SingletonHolder {
        private static final Singleton4 INSTANCE = new Singleton4();
    }

    /**
     * 静态内部类单例模式属于饿汉式单例模式的一种，它同样是在类加载时就创建了实例，
     * 但是它是通过静态内部类来实现的。静态内部类不会在外部类加载时就被加载，
     * 只有在调用getInstance()方法时才会被加载，从而实现了懒加载的效果。
     * 因此，静态内部类单例模式既保证了线程安全，又实现了懒加载。
     * 虽然它是懒加载的一种实现方式，但是由于它在类加载时就创建了实例，
     * 因此它仍然属于饿汉式单例模式的一种。
     * 相比于其他饿汉式单例模式的实现方式，静态内部类单例模式更加优雅和安全。
     * @return Singleton4单例
     */
    public static Singleton4 getInstance() {
        return SingletonHolder.INSTANCE;
    }

}
