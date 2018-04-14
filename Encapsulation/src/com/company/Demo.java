package com.company;

public class Demo {

    public static void main(String[] args) {

        Player tim = new Player();
        System.out.println(tim.getHandleName());
        tim.setHandleName("Tim");
        System.out.println(tim.getHandleName());
    }
}
