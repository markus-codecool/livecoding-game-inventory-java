package com.codecool.view;

import com.codecool.entity.Inventory;
import com.codecool.entity.Item;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class DisplayTest {

    @Test
    void groupItemsWithOneSizeInventory() {
        Inventory inventory = new Inventory();
        Item toast = new Item("Toast");
        inventory.add(toast);
        Display display = new Display();

        Map<String, Integer> itemsByName = display.groupItems(inventory);
        Integer toastCount = itemsByName.get(toast.getName());
        assertEquals(1, toastCount);
        assertEquals(1, itemsByName.size());
    }

    @Test
    void groupItemsWithEmptyInventory() {
        Inventory inventory = new Inventory();
        Display display = new Display();

        Map<String, Integer> itemsByName = display.groupItems(inventory);
        assertTrue(itemsByName.isEmpty());
    }
}