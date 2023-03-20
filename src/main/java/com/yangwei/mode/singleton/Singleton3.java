package com.yangwei.mode.singleton;

/**
 * @Author yangweiyao
 * @CreateTime 2023-03-20 16:06
 * @Description 双重校验锁单例模式
 **/
public class Singleton3 {

    /**
     * 在双重校验锁单例模式中，使用volatile关键字修饰instance变量是为了保证多线程环境下的可见性。<br>
     * 在Java中，每个线程都有自己的工作内存，当线程访问某个变量时，它会先从主内存中读取该变量的值拷贝到自己的工作内存中，然后对该变量进行操作。<br>
     * 当线程操作完该变量后，会将该变量的值刷新回主内存中。但是，由于编译器和处理器的优化，可能会导致某个线程在自己的工作内存中操作了该变量，<br>
     * 但是没有及时刷新回主内存中，导致其他线程无法看到该变量的最新值，从而出现线程安全问题。<br>
     * 使用volatile关键字修饰instance变量可以保证该变量的修改对其他线程的可见性，即每次读取该变量时都会从主内存中读取最新的值，<br>
     * 而不是使用线程自己工作内存中的旧值。此外，volatile关键字还可以禁止指令重排序优化，从而保证代码的正确性。<br>
     */
    private volatile static Singleton3 instance;

    /**
     * 构造器需要私有化，保证外部无法实例化
     */
    private Singleton3() {}

    /**
     * 双重校验，相比同步锁方法性能上可以保证第一次以后获取实例不需要加锁
     * @return Singleton3单例
     */
    public static Singleton3 getInstance() {
        if(instance == null) {
            synchronized (Singleton3.class) {
                if(instance == null) {
                    instance = new Singleton3();
                }
            }
        }
        return instance;
    }

}
