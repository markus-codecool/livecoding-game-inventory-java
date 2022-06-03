package com.codecool.entity;

import java.util.HashSet;
import java.util.Set;

public class Inventory {
    private final Set<Item> items;

    public Inventory() {
        items = new HashSet<>();
    }

    public void add(Item item) {
        items.add(item);
    }

    public Set<Item> getItems() {
        return items;
    }

    @Override
    public String toString() {
        return "Inventory{" +
                "items=" + items +
                '}';
    }
}
