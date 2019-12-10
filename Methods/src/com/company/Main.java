package com.company;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);


        calculateScore(true, 100, 6, 25000);
        calculateScore(true, 10000,8,200);

    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){

        if (gameOver){
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }
        return -1;
    }
}
