package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        boolean gameOver = true;
//        int score = 800;
//        int levelCompleted = 5;
//        int bonus = 100;

        int highScore = calculateScore(true, 900, 5, 100);
        System.out.println("Your final score was " + highScore);

        highScore = calculateScore(true, 10000, 8, 200);
        System.out.println("Your final score was " + highScore);

        displayHighScorePosition("Yahya", calculateHighScorePosition(300));

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
            return finalScore;
        }else{
            return -1;
        }
    }

    public static void displayHighScorePosition(String playerName, int playerPosition){
        System.out.println(playerName + " managed to get into position " + playerPosition + " on the highscore table");
    }

    public static int calculateHighScorePosition(int playerScore){
        if(playerScore >= 1000){
            return 1;
        }else if(playerScore >= 500 && playerScore < 1000){
            return 2;
        }else if(playerScore >= 100 && playerScore < 500){
            return 3;
        }else{
            return 4;
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