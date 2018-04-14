package com.company;

public class Demo {

    public static void main(String[] args) {

        Player tim = new Player();
        System.out.println(tim.getHandleName());
        tim.setNameAndLevel("Ti", 6);
        System.out.println(tim.getHandleName());
        System.out.println("Level: " + tim.getLevel());
        System.out.println("Lives: " + tim.getLives());


    }
}
