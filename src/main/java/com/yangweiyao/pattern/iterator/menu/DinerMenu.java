package com.yangweiyao.pattern.iterator.menu;

import com.yangweiyao.pattern.iterator.Menu;
import com.yangweiyao.pattern.iterator.MenuItem;
import com.yangweiyao.pattern.iterator.iterator.DinerMenuIterator;

import java.util.Iterator;

/**
 * @Author yangweiyao
 * @CreateTime 2023-04-04 08:11
 * @Description 面食的菜单项是使用数组来存储
 **/
public class DinerMenu implements Menu {

    private static final int MAX_ITEMS = 6;
    private int numberOfItems = 0;
    private final MenuItem[] menuItems;

    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];
        addItem("炒米粉", "主料是米粉", false, 8);
        addItem("炒河粉", "主料是河粉", false, 8);
        addItem("汤米粉", "主料是汤、米粉", false, 8);
        addItem("汤河粉", "主料是汤、河粉", false, 8);
    }

    @Override
    public void addItem(String name, String description,
                        boolean vegetarian, double price) {
        if(numberOfItems >= MAX_ITEMS) {
            System.out.println("警告！菜单数量已经超过限制");
        } else {
            MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
            menuItems[numberOfItems] = menuItem;
            numberOfItems++;
        }
    }

    @Override
    public Iterator<MenuItem> createIterator() {
        return new DinerMenuIterator(menuItems);
    }

    public int getNumberOfItems() {
        return numberOfItems;
    }

    public MenuItem[] getMenuItems() {
        return menuItems;
    }
}
