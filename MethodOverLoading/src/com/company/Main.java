package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int newScore = calculateScore("john", 500);
        System.out.println("New score " + newScore);

    }

    public static int calculateScore(String playerName, int score){
        System.out.println("Player " + playerName + " scored " + score + " points" );
        return score * 1000;
    }
}

//Lets you use the same methods with different parameters