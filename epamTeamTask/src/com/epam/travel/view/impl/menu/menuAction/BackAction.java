package com.epam.travel.view.impl.menu.menuAction;


import com.epam.travel.view.impl.menu.myMenu.MyMenu;

public class BackAction implements Action {
    private final int level;

    public BackAction(int level) {
        this.level = level;
    }

    @Override
    public boolean doAction() {
        MyMenu myMenu = new MyMenu();
        myMenu.showMenu();
        return true;
    }
}
