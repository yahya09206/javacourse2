package com.company;

public class Dog extends Animal {
    //fields that are specific to dogs
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    //Call constructor from other class by generating constructor
    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1 , 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    //private method unique to dog
    public void chew(){
        System.out.println("Dog.chew() called");
    }

    @Override
    public void eat() {
        System.out.println("Dog.eat() called");
        chew();
        super.eat();
    }

    public void walk(){
        System.out.println("Dog.walk() called");
        //in case something new needs to be created
        super.move(2);
    }

    public void run(){
        System.out.println("Dog.run() called");
        move(6);
    }

    private void moveLegs(int speed){
        System.out.println("Dog.moveLegs() called");
    }

    @Override
    public void move(int speed) {
        System.out.println("Dog.move() called");
        moveLegs(speed);
        super.move(speed);
    }
}


//Extends keywords lets you inherits from another one
//super means to call class were extending from and lets you initialize new class