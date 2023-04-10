package com.yangweiyao.pattern.iterator.menu;

import com.yangweiyao.pattern.iterator.Menu;
import com.yangweiyao.pattern.iterator.MenuItem;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @Author yangweiyao
 * @CreateTime 2023-04-06 08:09
 * @Description
 **/
public class CafeMenu implements Menu {

    private final Map<String, MenuItem> map;

    public CafeMenu() {
        map = new HashMap<>();
        addItem("浓缩咖啡", "双倍浓缩", false, 15);
        addItem("加冰咖啡", "双倍加冰", false, 15);
    }

    @Override
    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        map.put(menuItem.getName(), menuItem);
    }

    @Override
    public Iterator<MenuItem> createIterator() {
        return map.values().iterator();
    }
}
