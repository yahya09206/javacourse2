package com.company;

public class Car {

    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;

    // method to update model
    public void setModel(String model){
        String validModel = model.toLowerCase();
        if (validModel.equals("b7") || validModel.equals("commodore")){
            this.model = model;
        } else {
            this.model = "unknown";
        }

    }

    public String getModel(){
        return this.model;
    }


}


