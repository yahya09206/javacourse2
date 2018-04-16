package com.company;

enum LootType { POTION, RING, ARMOR }

public class Loot {
    private String name;
    private LootType type;
    private int value;

    public Loot(String name, LootType type, int value) {
        this.name = name;
        this.type = type;
        this.value = value;
    }
}
