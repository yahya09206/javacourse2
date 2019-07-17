package com.company;

public class PC {

    private Case theCase;
    private Monitor monitors;
    private MotherBoard motherBoard;

    public PC(Case theCase, Monitor monitors, MotherBoard motherBoard) {
        this.theCase = theCase;
        this.monitors = monitors;
        this.motherBoard = motherBoard;
    }

    public void powerUp(){
        theCase.pressPowerButton();
        drawLogo();
    }

    private void drawLogo(){
        // Fancy graphics
        monitors.drawPixelAt(1250, 50, "yellow");
    }

//    private Case getTheCase() {
//        return theCase;
//    }
//
//    private Monitor getMonitor() {
//        return monitors;
//    }
//
//    private MotherBoard getMotherBoard() {
//        return motherBoard;
//    }
}
