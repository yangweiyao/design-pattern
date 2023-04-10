package com.yangweiyao.pattern.iterator;

/**
 * @Author yangweiyao
 * @CreateTime 2023-04-06 08:31
 * @Description
 **/
public abstract class AbstractMenuItem implements MenuItemCollection {

    @Override
    public void add(MenuItemCollection menuItem) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void remove(MenuItemCollection menuItem) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void print() {
        throw new UnsupportedOperationException();
    }

}
