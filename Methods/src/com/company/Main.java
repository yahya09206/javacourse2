package com.company;

public class Main {

    public static void main(String[] args) {
	    boolean gameOver = true;
	    int score = 100;
	    int levelCompleted = 5;
	    int bonus = 100;

	    if (gameOver){
	        int finalScore = score + (levelCompleted * bonus);
	        finalScore += 1000;
            System.out.println("Your final score was " + finalScore);
        }

	    score = 100000;
	    levelCompleted = 8;
	    bonus = 200;

	    if (gameOver){
	        int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }
    }
}
