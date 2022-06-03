package com.codecool.view;

import com.codecool.entity.Inventory;
import com.codecool.entity.Item;

import java.util.HashMap;
import java.util.Map;

public class Display {

    public void displayInventory(Inventory inventory) {
        Map<String, Integer> itemsByName = groupItems(inventory);

        for (String itemName : itemsByName.keySet()) {
            Integer count = itemsByName.get(itemName);
            System.out.println(String.format("%s: %d", itemName, count));
        }
    }

    public Map<String, Integer> groupItems(Inventory inventory) {
        Map<String, Integer> itemsByName = new HashMap<>();

        for (Item item : inventory.getItems()) {
            if (itemsByName.containsKey(item.getName())) {
                Integer count = itemsByName.get(item.getName());
                count++;
                itemsByName.put(item.getName(), count);
            } else {
                itemsByName.put(item.getName(), 1);
            }
        }

        return itemsByName;
    }
}
