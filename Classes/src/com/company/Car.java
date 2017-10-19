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
        String validModel = model.toLowerCase();
        if(validModel.equals("a8") || validModel.equals("M7")){
            this.model = model;
        }else{
            this.model = "Unknown";
        }

    }

    //getter method to print something out
    public String getModel(){
        return this.model;
    }
}

//setters are good for when you want to do validations