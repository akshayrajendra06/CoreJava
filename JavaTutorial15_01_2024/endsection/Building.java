package com.JavaTutorial15_01_2024.endsection;

public class Building {

    private String name;
    private Item[] items;

    public Building(String name, Item[] items) {
        this.name = name;
        this.items = items;
    }

    public String getName() {
        return name;
    }

    public Item[] getItems() {
        return items;
    }
}