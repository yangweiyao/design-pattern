package com.yangweiyao.pattern.iterator;

import java.util.Iterator;

public interface Menu {

    void addItem(String name, String description, boolean vegetarian, double price);

    /**
     * 不同的菜单有不同的容器存储菜单项
     * 通过迭代器模式，可以保证不同存储有各自的遍历方式
     * @return 迭代器
     */
    Iterator<MenuItem> createIterator();

}
