package com.yangweiyao.pattern.composite.observe;

/**
 * @author yangweiyao
 * @createTime 2023/05/09 08:25
 * @description
 **/
public interface Observer {

    /**
     * 观察者
     * @param quackObservable
     */
    void update(QuackObservable quackObservable);

}
