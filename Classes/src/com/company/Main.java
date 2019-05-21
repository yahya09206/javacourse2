package com.company;

public class Main {

    public static void main(String[] args) {

        // Create Car Object
        Car audi = new Car();
        Car tesla = new Car();
        audi.setModel("A8");
        System.out.println("Model is " + audi.getModel());
    }
}