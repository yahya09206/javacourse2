package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int newScore = calculateScore("yo", 500);
        System.out.println("New score is " + newScore);
        calculateScore(75);
        calculateScore();
    }

    public static int calculateScore(String name, int score){
        System.out.println("Player " + name + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score){
        System.out.println("unnamed player scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(){
        System.out.println("no player name, no player points");
        return 0;
    }

}
