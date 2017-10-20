package com.company;

public class Dog extends Animal {
    //fields that are specific to dogs
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    //Call constructor from other class by generating constructor
    public Dog(String name, int size, int weight) {
        super(name, 1 , 1, size, weight);
    }
}


//Extends keywords lets you inherits from another one
//super means to call class were extending from and lets you initialize new class