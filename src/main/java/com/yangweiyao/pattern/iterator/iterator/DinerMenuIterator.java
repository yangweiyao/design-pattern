package com.yangweiyao.pattern.iterator.iterator;

import com.yangweiyao.pattern.iterator.MenuItem;

import java.util.Iterator;

/**
 * @Author yangweiyao
 * @CreateTime 2023-04-04 08:30
 * @Description 面食的迭代器
 **/
public class DinerMenuIterator implements Iterator<MenuItem> {

    private final MenuItem[] menuItems;

    private int position = 0;

    public DinerMenuIterator(MenuItem[] menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        return position < menuItems.length && menuItems[position] != null;
    }

    @Override
    public MenuItem next() {
        MenuItem menuItem = menuItems[position];
        position++;
        return menuItem;
    }

    @Override
    public void remove() {
        // 这里如果调用父类方法，会抛UnsupportedOperationException异常
        // Iterator.super.remove();
        if(position <= 0) {
            throw new IllegalArgumentException("数组越界");
        }
        if(menuItems[position - 1] != null) {
            for (int i = position - 1; i < menuItems.length - 1; i++) {
                // 后面的元素往前移动
                menuItems[i] = menuItems[i + 1];
            }
            menuItems[menuItems.length - 1] = null;
        }
    }
}
