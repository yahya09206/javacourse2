package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        boolean gameOver = true;
        int score = 10000;
        int levelCompleted = 5;
        int bonus = 100;

        calculateScore(true, 800, 5, 100);

        int score2 = 10000;
        int levelCompleted2 = 8;
        int bonus2 = 200;

        if (gameOver){
            int finalScore = score2 + (levelCompleted2 * bonus2);
            System.out.println("Your final score was " + finalScore);
        }
    }

    // Method to calculate score
    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){
        boolean gameOver = true;
        int score = 10000;
        int levelCompleted = 5;
        int bonus = 100;

        if (gameOver){
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }
    }
}
