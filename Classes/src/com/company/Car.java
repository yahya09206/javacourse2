package com.company;

public class Car {

    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String colour;

    //setter method for class that's attached to class publicly accessible
    public void setModel(String model){
        //keyword "this" refers to the field you're creating the setter and getter for
        this.model = model;
    }

    //getter method to print something out
    public String getModel(){
        return this.model;
    }
}
