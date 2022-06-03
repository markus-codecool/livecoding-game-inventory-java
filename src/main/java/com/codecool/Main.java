package com.codecool;

import com.codecool.entity.Inventory;
import com.codecool.entity.Item;
import com.codecool.view.Display;

public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        Item potion = new Item("Potion");
        Item sword = new Item("Sword");
        Item sword2 = new Item("Sword");

        inventory.add(potion);
        inventory.add(sword);
        inventory.add(sword2);

        Display display = new Display();
        display.displayInventory(inventory);
    }
}