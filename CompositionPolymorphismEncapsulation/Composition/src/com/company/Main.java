package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Dimensions dimensions = new Dimensions(20, 20, 5);
        Case newCase = new Case("220B", "Dell", "240", dimensions);

        Monitor theMonitor = new Monitor("27 inch Beast", "Acer", 27, new Resolution(2540, 1440));

        MotherBoard theMotherBoard = new MotherBoard("BJ-200", "Asus", 4,6,"v2.44");

        PC thePC = new PC(newCase, theMonitor, theMotherBoard);
//        thePC.getMonitor().drawPixelAt(1500, 1200, "red");
//        thePC.getMotherBoard().loadProgram("Windows 1.0");
//        thePC.getTheCase().pressPowerButton();
        thePC.powerUp();
    }
}

//Inheritance is known as
    //is-a relationship with vehicle
        //meaning a car is a vehicle

//Composition is a Has-A relationship
    //general rule is to look at composition before using inheritance
