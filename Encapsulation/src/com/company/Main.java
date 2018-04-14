package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int lives = 3;
        boolean isGameOver = (lives < 1);
        if(isGameOver){
            System.out.println("Game over!");
        }else {
            System.out.println("You're still alive");
        }
    }
}
