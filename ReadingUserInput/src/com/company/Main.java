package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
    //Set up scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter you name: ");
        //Read line of input
        String name = scanner.nextLine();
        System.out.println("Your name is " + " " + name);

        //close scanner
        scanner.close();
    }
}
