package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        boolean gameOver = true;
//        int score = 800;
//        int levelCompleted = 5;
//        int bonus = 100;

        calculateScore(true, 900, 5, 100);
        calculateScore(true, 10000, 8, 200);

//        score = 10000;
//        levelCompleted = 8;
//        bonus = 200;
//
//        if(gameOver){
//            int finalScore = score + (levelCompleted * bonus);
//            System.out.println("Your final score was " + finalScore);
//        }
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){
//        boolean gameOver = true;
//        int score = 800;
//        int levelCompleted = 5;
//        int bonus = 100;

        if(gameOver){
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score was " + finalScore);
        }
    }
}



//Methods are created once but are able to be used over and over again
//methods start outside of other methods but inside of public class
//arguments are the actual values we want the variables to store and use
//passing parameters is the same as declaring variables for them
//void means don't return anything back
//if you want to return something then replace void with datatype that you want to return
//needs something returned even if game isn't played