package com.yangweiyao.mode.iterator.menu;

import com.yangweiyao.mode.iterator.AbstractMenuItem;
import com.yangweiyao.mode.iterator.MenuItemCollection;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author yangweiyao
 * @CreateTime 2023-04-06 08:46
 * @Description
 **/
public class Menu extends AbstractMenuItem {

    private final List<MenuItemCollection> menuItemCollections;
    private final String name;
    private final String description;

    public Menu(String name, String description) {
        menuItemCollections = new ArrayList<>();
        this.name = name;
        this.description = description;
    }


    @Override
    public void add(MenuItemCollection menuItem) {
        menuItemCollections.add(menuItem);
    }

    @Override
    public void remove(MenuItemCollection menuItem) {
        menuItemCollections.remove(menuItem);
    }

    public MenuItemCollection getChild(int i) {
        return menuItemCollections.get(i);
    }

    public void print() {
        System.out.print("\n" + getName());
        System.out.println(", " + getDescription());
        System.out.println("---------------------");
        for (MenuItemCollection menuItem : menuItemCollections) {
            menuItem.print();
        }
    }

    public List<MenuItemCollection> getMenuItemCollections() {
        return menuItemCollections;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
