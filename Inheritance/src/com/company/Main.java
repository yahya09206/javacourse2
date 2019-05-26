package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Animal basicAnimal = new Animal("Mike", 1,1,23,45);

        Dog basicDog = new Dog("Yorkie", 8,20,2,4,1,20,"long silky coat");
        basicDog.eat();
        basicDog.run();

        //Car class instances for inheritance challenge
        Car basicCar = new Car();
    }
}
