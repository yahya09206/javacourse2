package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int newScore = calculateScore("Tim", 500);
        System.out.println("New score is " + newScore);
        calculateScore(10000);
        calculateScore();
        calcFeetAndInchesToCentimeters(6, 10);
        calcFeetAndInchesToCentimeters(100);
    }

    public static int calculateScore(String playerName, int score){
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score){
        System.out.println("Unnamed player " + "scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(){
        System.out.println("No player name, no player score");
        return 0;
    }

    //Overloaded method challenge
    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if ((feet >= 0) && (inches >= 0 && inches <= 12)){
            //Convert feet and inches to centimeters
            double centimeters = feet * 30.48;
            centimeters += inches * 2.54;
            System.out.println(feet + " ft " + inches + "inches = " + centimeters + "cm");
            return centimeters;
        }else {
            return -1;
        }
    }

    public static double calcFeetAndInchesToCentimeters(double inches){
        if(inches >= 0){
            double feet = (int) inches / 12;
            double remainingInches = (int) inches % 12;
            System.out.println(inches + " inches is equal to " + feet + "ft and " + remainingInches +" inches");
            return calcFeetAndInchesToCentimeters(feet, remainingInches);
        }else {
            return -1;
        }
    }
}


//Use the same method name but with different parameters