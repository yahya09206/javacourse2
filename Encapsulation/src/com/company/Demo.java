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
//        System.out.println(tim.getWeapon().getName());

        Weapon myAxe = new Weapon("Goldshine Axe", 50, 50);
        tim.setWeapon(myAxe);
        System.out.println(tim.getWeapon().getName());

        Loot redPotion = new Loot("Red Potion", LootType.POTION, 7);
        tim.pickUpLoot(redPotion);

        ArrayList<Loot> allItems = tim.getInventory();
        for(Loot item : allItems){
            System.out.println(item.getName());
        }

    }
}
