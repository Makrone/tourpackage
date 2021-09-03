package com.epam.travel.view.impl.menu.myMenu;

import java.util.List;

public class MyMenu {
    public static void showMenu() {
        List<MyMenuItem> menuItems = MyMenuItem.filterByLevel();
        for (MyMenuItem items : menuItems) {
            System.out.println(items.toString());
        }
    }

}
