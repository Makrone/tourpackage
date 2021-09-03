package com.epam.travel.view.impl.menu.menuAction;


import com.epam.travel.view.impl.menu.myMenu.MyMenu;

public class ShowAllRequest implements Action{
    private int key;

    public ShowAllRequest(int key) {
        this.key = key;
    }

    @Override
    public boolean doAction() {

        MyMenu.showMenu();
        return true;
    }
}
