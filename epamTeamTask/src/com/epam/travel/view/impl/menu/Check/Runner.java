package com.epam.travel.view.impl.menu.Check;


import com.epam.travel.view.impl.menu.myMenu.MyMenu;
import com.epam.travel.view.impl.menu.myMenu.MyMenuItem;

import java.util.Scanner;

public class Runner {
  static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean action = true;
        while (action) {
            System.out.println("Выберите список меню :");
            MyMenu.showMenu();
            int clientChoice = scanner.nextInt();
            MyMenuItem selectedItem = MyMenuItem.getItemsByKeyAndLevel(clientChoice,1);
            boolean isLastAction = false;
            if (selectedItem != null) {
                isLastAction = selectedItem.getAction().doAction();
            }
            if (isLastAction) {
                action = true;
            }else {
                action = false;
            }
        }
    }
}
