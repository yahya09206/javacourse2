package com.company;

public class Case {

    private String model;
    private String manufacturer;
    private String powerSupply;
    private Deminsions dimensions;

    public Case(String model, String manufacturer, String powerSupply, Deminsions dimensions) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.powerSupply = powerSupply;
        this.dimensions = dimensions;
    }

    public void pressPowerButton(){
        System.out.println("Power button pressed");
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getPowerSupply() {
        return powerSupply;
    }

    public Deminsions getDimensions() {
        return dimensions;
    }
}
