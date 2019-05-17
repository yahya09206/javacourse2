package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        boolean gameOver = true;
//        int score = 800;
//        int levelCompleted = 5;
//        int bonus = 100;
//
//       int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
//        System.out.println("Your final score was " + highScore);
//
//       score = 10000;
//       levelCompleted = 8;
//       bonus = 200;
//
//        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
//        System.out.println("Your final score was " + highScore);



    }

    // Method to calculate score
//    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){
//
//        if (gameOver){
//            int finalScore = score + (levelCompleted * bonus);
//            finalScore += 2000;
//            return finalScore;
//        }else{
//            return -1;
//        }
//    }

    // Challenge for Method lecture
    public static void displayHighScorePosition(String name, int position){
        System.out.println(name + " managed to get into position " + position + " on the high score table.");
    }

}
