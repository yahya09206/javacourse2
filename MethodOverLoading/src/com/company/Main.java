package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here


//        int newScore = calculateScore("john", 500);
//        System.out.println("New score " + newScore);
//        calculateScore(75);
//        calculateScore();

    }

    public static double  calcFeetAndInchesToCentimeters(double feet, double inches){
        if((feet >= 0) && (inches >= 0 && <= 12)){
            double ft = 30.48 * feet;
            double in = 2.54 * inches;
        }
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
