package com.company;

import java.util.ArrayList;

public class Demo {

    public static void main(String[] args) {
//        Enemy enemy = new Enemy("test enemy", 10, 3);
//        enemy.showInfo();
//
//        //test damage life method
//        enemy.takeDamage(3);
//        enemy.showInfo();

        Troll uglyTroll = new Troll("Ugly Troll");
        uglyTroll.showInfo();
        uglyTroll.takeDamage(30);

        Vampire vlad = new Vampire("Vlad");
        vlad.showInfo();
        vlad.takeDamage(8);
        vlad.showInfo();
    }

}
