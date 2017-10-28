package com.company;

public class Car extends Vehicle {
    private int doors;
    private int engineCapicity;

    public Car(String name, int doors, int engineCapicity) {
        super(name);
        this.doors = doors;
        this.engineCapicity = engineCapicity;
    }
}
