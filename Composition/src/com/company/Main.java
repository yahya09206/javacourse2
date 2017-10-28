package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //Case for iMac
        Dimensions dimensions = new Dimensions(20,20,5);
        Case theCase = new Case("2208", "Apple", "240", dimensions);

        //Monitors
        Monitor theMonitor = new Monitor("27inch iPro", "iMac", 27, new Resolution(2540, 1440));

        //Motherboard
        Motherboard theMotherBoard = new Motherboard("BJ-200", "Apple", 4, 5, "v2.44");
    }
}

//Composition deals with the 'has a relationship'
//computer example