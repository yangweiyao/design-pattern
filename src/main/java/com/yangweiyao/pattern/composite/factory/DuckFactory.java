package com.yangweiyao.pattern.composite.factory;

import com.yangweiyao.pattern.composite.AbstractDuckFactory;
import com.yangweiyao.pattern.composite.Quackable;

/**
 * @Author yangweiyao
 * @CreateTime 2023-05-06 08:06
 * @Description 负责生产鸭子
 **/
public class DuckFactory extends AbstractDuckFactory {

    @Override
    public Quackable createDuck(Class<? extends Quackable> clazz) {
        try {
            return clazz.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
