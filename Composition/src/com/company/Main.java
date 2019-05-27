package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Dimensions dimensions = new Dimensions(20,20,5);
        Case theCase = new Case("220B", "Dell", "240", dimensions);

        Monitor theMonitor = new Monitor("27 inch beast", "acer", 27, new Resolution(2540, 1440));

        MotherBoard theMotherBoard = new MotherBoard("BJ-200", "Asus", 4,6,"v2.44");

        // New PC
        PC thePC = new PC(theCase, theMonitor, theMotherBoard);
    }
}
