package com.yangweiyao.pattern.composite.factory;

import com.yangweiyao.pattern.composite.AbstractDuckFactory;
import com.yangweiyao.pattern.composite.Quackable;
import com.yangweiyao.pattern.composite.decorate.QuackCounter;
import com.yangweiyao.pattern.composite.observe.Observable;

/**
 * @Author yangweiyao
 * @CreateTime 2023-05-06 08:10
 * @Description 负责生产需要计算鸭子叫声的鸭子
 **/
public class CountingDuckFactory extends AbstractDuckFactory {

    @Override
    public Quackable createDuck(Class<? extends Quackable> clazz) {
        try {
            return new QuackCounter(clazz.newInstance());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
