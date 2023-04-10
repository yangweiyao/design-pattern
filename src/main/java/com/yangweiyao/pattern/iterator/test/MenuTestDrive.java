package com.yangweiyao.pattern.iterator.test;

import com.yangweiyao.pattern.iterator.Menu;
import com.yangweiyao.pattern.iterator.MenuItem;
import com.yangweiyao.pattern.iterator.MenuItemCollection;
import com.yangweiyao.pattern.iterator.Waitress;
import com.yangweiyao.pattern.iterator.menu.CafeMenu;
import com.yangweiyao.pattern.iterator.menu.DinerMenu;
import com.yangweiyao.pattern.iterator.menu.PancakeHouseMenu;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author yangweiyao
 * @CreateTime 2023-04-04 08:49
 * @Description
 **/
public class MenuTestDrive {

    public static void main(String[] args) {

        System.out.println("====== 迭代器模式 ======");
        List<Menu> menus = new ArrayList<>(2);
        menus.add(new DinerMenu());
        menus.add(new PancakeHouseMenu());
        menus.add(new CafeMenu());
        Waitress waitress = new Waitress(menus);
        waitress.printMenu();

        System.out.println("\n====== 组合模式 ======");
        MenuItemCollection allMenus = new com.yangweiyao.pattern.iterator.menu.Menu("总菜单", "所有菜单");

        MenuItemCollection pancakeHouseMenu = new com.yangweiyao.pattern.iterator.menu.Menu("煎饼菜单", "小吃类");
        allMenus.add(pancakeHouseMenu);

        MenuItemCollection dinerMenu = new com.yangweiyao.pattern.iterator.menu.Menu("面食菜单", "汤粉类");
        allMenus.add(dinerMenu);

        MenuItemCollection cafeMenu = new com.yangweiyao.pattern.iterator.menu.Menu("咖啡菜单", "甜食类");
        cafeMenu.add(new MenuItem("浓缩咖啡", "双倍浓缩", false, 15));
        allMenus.add(cafeMenu);

        dinerMenu.add(new MenuItem("湿炒牛河", "主要有牛肉、芥蓝", false, 18));
        dinerMenu.add(cafeMenu);

        Waitress waitress_v2 = new Waitress(allMenus);
        waitress_v2.printMenu_v2();

    }

}
