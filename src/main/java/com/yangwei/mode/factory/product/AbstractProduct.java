package com.yangwei.mode.factory.product;

/**
 * @Author yangweiyao
 * @CreateTime 2023-03-17 08:57
 * @Description
 **/
public abstract class AbstractProduct {

    protected String name;

    @Override
    public String toString() {
        return name;
    }

}
