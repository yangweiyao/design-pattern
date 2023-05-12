package com.yangweiyao.pattern.composite;

/**
 * @Author yangweiyao
 * @CreateTime 2023-05-06 08:02
 * @Description
 **/
public abstract class AbstractDuckFactory {

    /**
     * 创建不同类型的鸭子
     * @param clazz 鸭子类型
     * @return 鸭子
     */
    public abstract Quackable createDuck(Class<? extends Quackable> clazz);

}
