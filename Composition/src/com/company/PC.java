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

    public Case getTheCase() {
        return theCase;
    }

    public Monitor getMonitor() {
        return monitors;
    }

    public MotherBoard getMotherBoard() {
        return motherBoard;
    }
}
