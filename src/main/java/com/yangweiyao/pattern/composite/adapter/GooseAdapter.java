package com.yangweiyao.pattern.composite.adapter;

import com.yangweiyao.pattern.composite.AbstractDuck;
import com.yangweiyao.pattern.composite.Quackable;
import com.yangweiyao.pattern.composite.animal.Goose;
import com.yangweiyao.pattern.composite.observe.Observable;
import com.yangweiyao.pattern.composite.observe.Observer;

/**
 * @Author yangweiyao
 * @CreateTime 2023-05-05 08:24
 * @Description 利用适配器将鹅配成鸭子
 **/
public class GooseAdapter extends AbstractDuck {

    private final Goose goose;

    public GooseAdapter(Goose goose) {
        this.goose = goose;
    }

    @Override
    protected void callQuack() {
        goose.honk();
    }

}
