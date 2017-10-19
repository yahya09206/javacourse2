package com.company;

public class Main {

    public static void main(String[] args) {
        calcFeetAndInchesToCentimeters(6, 0);

//        int newScore = calculateScore("john", 500);
//        System.out.println("New score " + newScore);
//        calculateScore(75);
//        calculateScore();

    }

    public static double  calcFeetAndInchesToCentimeters(double feet, double inches){
        if((feet < 0) || (inches < 0) || (inches > 12)){
            System.out.println("Invalid ft or in parameters");
            return -1;
        }

        double centimeters = (feet * 12) * 2.54;
        centimeters += inches * 2.54;
        System.out.println(feet + " feet " + inches + " inches = " + centimeters + " cm");
        return centimeters;
    }

    public static double calcFeetAndInchesToCentimeters(double inches){
        if(inches < 0){
            return -1;
        }

        double feet = (int) inches / 12;
        double remainingInches = (int) inches % 12;
        System.out.println(inches + " inches is = to " + feet + " feet and " + remainingInches + " inches");
        return calcFeetAndInchesToCentimeters(feet, inches);

    }

//    public static int calculateScore(String playerName, int score){
//        System.out.println("Player " + playerName + " scored " + score + " points" );
//        return score * 1000;
//    }
//
//    public static int calculateScore(int score){
//        System.out.println("Unmamed player scored " + score + " points" );
//        return score * 1000;
//    }
//
//    public static int calculateScore(){
//        System.out.println("No player name with 0 points" );
//        return 0;
//    }

}

//Lets you use the same methods with different number of parameters
//overloading
//cant create two method with no parameters, amount of parameters for same method name always have to be different
