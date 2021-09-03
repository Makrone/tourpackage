package com.epam.travel.view.impl.menu.menuAction;


import com.epam.travel.view.impl.menu.myMenu.MyMenu;

public class CreateRequestAction implements Action {
    private final int key;

    public CreateRequestAction(int key) {
        this.key = key;
    }

    @Override
    public boolean doAction() {

        MyMenu.showMenu();
        return true;
    }
}
