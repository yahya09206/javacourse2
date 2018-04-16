package com.company;

import java.util.ArrayList;

public class Demo {

    public static void main(String[] args) {

        Player tim = new Player("Tom Smith");
        System.out.println(tim.getHandleName());
        System.out.println("Level: " + tim.getLevel());
        System.out.println("Lives: " + tim.getLives());
//        System.out.println(tim.getWeapon().getName());
//        Weapon timsWeapon = tim.getWeapon();
//        System.out.println(timsWeapon.getName());
        System.out.println(tim.getWeapon().getName());

        Weapon myAxe = new Weapon("Goldshine Axe", 50, 50);
        tim.setWeapon(myAxe);
        System.out.println(tim.getWeapon().getName());

        Loot redPotion = new Loot("Red Potion", LootType.POTION, 7);
        tim.pickUpLoot(redPotion);

        tim.pickUpLoot(new Loot("+3 chest armor", LootType.ARMOR, 80));
        tim.pickUpLoot(new Loot("+2 ring of protection", LootType.RING, 40));
        tim.pickUpLoot(new Loot("Invisibility Potion", LootType.POTION, 35));

        tim.showInventory();

        Loot bluePotion = new Loot("Blue Potion", LootType.POTION, 6);
        boolean wasDeleted = tim.dropLoot(bluePotion);
        System.out.println(wasDeleted);
        tim.showInventory();

    }
}
