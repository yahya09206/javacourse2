package com.company;

public class AudiA7 extends Car {

    private int roadServiceMonths;

    public AudiA7(int roadServiceMonths) {
        super("Audi A7", "AWD", 5, 5, 6, true);
        this.roadServiceMonths = roadServiceMonths;
    }

    public void accelerate(int rate){

        int newVelocity = getCurrentVelocity() + rate;
        if (newVelocity == 0){
            stop();
        } else if (newVelocity > 0 && newVelocity <= 10){
            changeGear(1);
        }else {
            changeGear(2);
        }

        if (newVelocity > 0){
            changeVelocity(newVelocity, getCurrentDirection());
        }
    }
}
