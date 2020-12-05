package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        Player player = new Player();
//        player.fullName = "Tim";
//        player.health = 20;
//        player.weapon = "Sword";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());
//
//        damage = 11;
//        player.health = 200;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());

        EnhancedPlayer player = new EnhancedPlayer("Tim", 200, "Sword");
        System.out.println("Initial health is " + player.getHealth());
//        Printer printer = new Printer(50, 5, false);
//        System.out.println("Toner level is " + printer.getTonerLevel());

        Printer printer2 = new Printer(50, true);
        System.out.println("Initial page count = " + printer2.getPagesPrinted());
        int pagesPrinted = printer2.printPages(4);
        System.out.println("Pages printed was " + pagesPrinted + " new total print count for printer = " + printer2.getPagesPrinted());
    }
}
