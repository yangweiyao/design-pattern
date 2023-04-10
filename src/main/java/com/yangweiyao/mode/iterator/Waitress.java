package com.yangweiyao.mode.iterator;

import java.util.Iterator;
import java.util.List;

/**
 * @Author yangweiyao
 * @CreateTime 2023-04-04 08:42
 * @Description 招待员
 **/
public class Waitress {

    private List<Menu> menus;
    private MenuItemCollection menuItems;

    public Waitress(List<Menu> menus) {
        this.menus = menus;
    }

    public Waitress(MenuItemCollection menuItems) {
        this.menuItems = menuItems;
    }

    public void printMenu() {
        menus.forEach(menu -> printMenu(menu.createIterator()));
    }

    public void printMenu_v2() {
        menuItems.print();
    }

    private void printMenu(Iterator<MenuItem> iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = iterator.next();
            System.out.print(menuItem.getName() + ", ");
            System.out.print(menuItem.getPrice() + " -- ");
            System.out.println(menuItem.getDescription());
        }
    }

    public MenuItemCollection getMenuItems() {
        return menuItems;
    }

    public List<Menu> getMenus() {
        return menus;
    }
}
