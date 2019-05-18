package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int newScore = calculateScore("Tim", 500);
        System.out.println("New score is " + newScore);
        calculateScore(75);
        calculateScore();
    }

    // Calculate score method
    public static int calculateScore(String playerName, int score){
        System.out.println("Player " + playerName + " scored " + score + " points.");
        return score * 1000;
    }

    // Overloaded method
    public static int calculateScore(int score){
        System.out.println("Unnamed Player " + " scored " + score + " points.");
        return score * 1000;
    }

    public static int calculateScore(){
        System.out.println("Unnamed Player, no player score.");
        return 0;
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if(feet >= 0 && inches >= 0 && inches <=12){
            double fttocm = (feet * 30.48);
            double inchtocm = (inches * 2.54);
            System.out.println("Feet to cm " + fttocm + ", inches to cm " + inchtocm);
        }
        return -1;
    }
}
