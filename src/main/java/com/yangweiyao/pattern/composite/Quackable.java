package com.yangweiyao.pattern.composite;

import com.yangweiyao.pattern.composite.observe.QuackObservable;

/**
 * @author yangweiyao
 */
public interface Quackable extends QuackObservable {

    /**
     * 鸭叫
     */
    void quack();

}
