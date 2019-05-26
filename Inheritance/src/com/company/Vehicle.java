package com.company;

public class Vehicle {

    private String name;
    private int doors;
    private int wheels;
    private int steeringWheel;

    public Vehicle(String name, int doors, int wheels, int steeringWheel) {
        this.name = name;
        this.doors = doors;
        this.wheels = wheels;
        this.steeringWheel = steeringWheel;
    }

    public void speed(int speed){
        System.out.println("Vehical.speed() was called");
    }

    public void gears(int gears){
        System.out.println("Vehicle.gears() was called");
    }

    public String getName() {
        return name;
    }

    public int getDoors() {
        return doors;
    }

    public int getWheels() {
        return wheels;
    }

    public int getSteeringWheel() {
        return steeringWheel;
    }
}
