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

        Wall wall1 = new Wall("West");
        Wall wall2 = new Wall("East");
        Wall wall3 = new Wall("South");
        Wall wall4 = new Wall("North");

        Ceiling ceiling = new Ceiling(12, 55);

        Bed bed = new Bed("Modern", 4,3,2,1);

        Lamp lamp = new Lamp("Classic", false, 75);

        Bedroom bedroom = new Bedroom("Tims", wall1, wall2, wall3, wall4, ceiling, bed, lamp);
        bedroom.makeBed();
        bedroom.getLamp().turnOn();



    }
}

//Inheritance is known as
    //is-a relationship with vehicle
        //meaning a car is a vehicle

//Composition is a Has-A relationship
    //general rule is to look at composition before using inheritance
