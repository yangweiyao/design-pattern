package com.yangweiyao.pattern.iterator.menu;

import com.yangweiyao.pattern.iterator.Menu;
import com.yangweiyao.pattern.iterator.MenuItem;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Author yangweiyao
 * @CreateTime 2023-04-04 08:04
 * @Description 煎饼的菜单项是使用List来存储
 **/
public class PancakeHouseMenu implements Menu {

    private final List<MenuItem> menuItems;

    public PancakeHouseMenu() {
        this.menuItems = new ArrayList<>();
        addItem("蔬菜煎饼", "主要有西红柿组成",  true, 7);
        addItem("牛肉煎饼", "主要有牛肉组成",  false, 12);
        addItem("猪扒煎饼", "主要有猪扒组成",  false, 10);
        addItem("香葱煎饼", "主要有香葱组成",  true, 5);
    }

    @Override
    public void addItem(String name, String description,
                        boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }

    @Override
    public Iterator<MenuItem> createIterator() {
        return menuItems.iterator();
    }

    public List<MenuItem> getMenuItems() {
        return menuItems;
    }
}
