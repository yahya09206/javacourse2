package com.company;

public class Dog extends Animal {
    //Call constructor from other class by generating constructor
    public Dog(String name, int brain, int body, int size, int weight) {
        super(name, brain, body, size, weight);
    }
}


//Extends keywords lets you inherits from another one