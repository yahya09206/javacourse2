package com.company;

public class Demo {

    public static void main(String[] args) {

        Player tim = new Player();
        System.out.println(tim.getHandleName());
        tim.setNameAndLevel("Tim", 6);
        System.out.println(tim.getHandleName());
        System.out.println("Level: " + tim.getLevel());
        System.out.println("Lives: " + tim.getLives());
        System.out.println(tim.getWeapon().getName());

        Player luis = new Player("Luis");
        System.out.println(luis.getHandleName());


    }
}
