package com.company;

public class Car extends Vehicle {

    private int windows;
    private int doors;

    public Car(int wheels, int doors, int trunk, String name, int windows, String fuelType, int windows1, int doors1) {
        super(wheels, doors, trunk, name, windows, fuelType);
        this.windows = windows1;
        this.doors = doors1;
    }
}
