package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //create instance of class
        Car audi = new Car();
        Car bmw = new Car();
        //call setter/getter method
        audi.setModel("911");
        System.out.println("Model is " + audi.getModel());
    }
}

/*
-classes are real world objects that consist of state and behavior
-software objects store states in fields and behaviors in methods
-class is a template for creating objects
-when defining field in java you go with the private modifiers
-encapsulation hides fields from view outside of objects definition
-always have to use "new" keyword when creating classes
*/
