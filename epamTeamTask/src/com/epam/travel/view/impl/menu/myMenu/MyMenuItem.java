package com.epam.travel.view.impl.menu.myMenu;


import com.epam.travel.view.impl.menu.menuAction.*;

import java.util.ArrayList;
import java.util.List;

public enum MyMenuItem  {
    CREATE_REQUEST("Создать туристическую путевку", new CreateRequestAction(1), 1,1),
    SHOW_MENU("Поиски туристической путевки", new SearchAction(1), 2,1),
    SHOW_ALL_REQUEST("Показать все путевки",new ShowAllRequest(2),3,1),
    EXIT("Выход", new ExitAction(), 4,1);
    private String description;
    private Action action;
    private int key;
    private Integer level;

    MyMenuItem(String description, Action miAction, int key, Integer level) {
        this.description = description;
        this.action = miAction;
        this.key = key;
        this.level = level;
    }

    public static MyMenuItem getItemsByKeyAndLevel(int key, int level) {
        for (MyMenuItem menuItems : values()) {
            if (menuItems.getKey() == key && menuItems.getLevel().equals(level)) {
                return menuItems;
            }
        }
        return null;
    }

    public static List<MyMenuItem> filterByLevel() {
        List<MyMenuItem> orders = new ArrayList<>();
        for (MyMenuItem items : values()) {

                orders.add(items);

        }
        return orders;
    }
    public static List<MyMenuItem> filterByKey(int level) {
        List<MyMenuItem> orders = new ArrayList<>();
        for (MyMenuItem items : values()) {
            if (items.getLevel().equals(level)) {
                orders.add(items);
            }
        }
        return orders;
    }
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(key).append(")").append(description);
        return sb.toString();
    }


    public String getDescription() {
        return description;
    }

    public Action getAction() {
        return action;
    }

    public int getKey() {
        return key;
    }

    public Integer getLevel() {
        return level;
    }
}
