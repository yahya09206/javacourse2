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

        PC thePC = new PC(theCase, theMonitor, theMotherBoard);
        //Access methods from different class. This example will draw pixels
//        thePC.getMonitor().drawPixelAt(1500,1200,"red");
//        thePC.getMotherboard().loadProgram("Sierra");
//        thePC.getTheCase().pressPowerButton();
        thePC.powerUp();

        //Challenge
    }
}

//Composition deals with the 'has a relationship'
//computer example