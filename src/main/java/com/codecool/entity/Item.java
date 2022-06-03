package com.codecool.entity;

public class Item {
    private final String name;

    public Item(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return getName();
    }

    public String getName() {
        return name;
    }
}
