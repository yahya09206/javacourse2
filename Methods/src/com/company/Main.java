package com.company;

public class Main {

    public static void main(String[] args) {

        int highScore = calculateScore(true, 800, 5, 100);
        System.out.println("Your final score was " + highScore);

        highScore = calculateScore(true, 10000, 8, 200);
        System.out.println("Your final score was " + highScore);

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Mikey", highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("James", highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Bob", highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("John", highScorePosition);

        displayHighScorePosition("Mikey", calculateHighScorePosition(1500));
        displayHighScorePosition("Mikey", calculateHighScorePosition(900));
        displayHighScorePosition("Mikey", calculateHighScorePosition(400));
        displayHighScorePosition("Mikey", calculateHighScorePosition(50));


    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){
        if (gameOver){
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            return finalScore;
        }else {
            return -1;
        }
    }

    //Method challenge
    public static  void displayHighScorePosition(String name, int position){
        System.out.println(name + " managed to get into position " + position);
    }

    public static int calculateHighScorePosition(int playerScore){
        if (playerScore >= 1000){
            return 1;
        }else if(playerScore >= 500 && playerScore < 1000){
            return 2;
        }else if(playerScore >= 100 && playerScore < 500){
            return 3;
        }else {
            return 4;
        }
    }


}
//Statement is the entire line of code