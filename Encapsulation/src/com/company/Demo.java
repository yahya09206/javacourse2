package com.company;

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



    }
}
