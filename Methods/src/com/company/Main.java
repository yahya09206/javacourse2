package com.company;

public class Main {

    public static void main(String[] args) {

        int highScore = calculateScore(true, 800, 5, 100);
        System.out.println("Your final score was " + highScore);

        highScore = calculateScore(true, 10000, 8, 200);
        System.out.println("Your final score was " + highScore);

        displayHighScorePosition("yahya", calculateHighScorePosition(1500));
        displayHighScorePosition("yahya", calculateHighScorePosition(900));
        displayHighScorePosition("yahya", calculateHighScorePosition(400));
        displayHighScorePosition("yahya", calculateHighScorePosition(50));

    }

    //New method for calculating score
    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){

        if (gameOver){
            int finalScore = score + (levelCompleted + bonus);
            finalScore += 1000;
            return finalScore;
        }
        return -1;
    }

    //Method challenge
    public static void displayHighScorePosition(String name, int position){
        System.out.println(name + " managed to get into position " + position + " on the high score table");
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
