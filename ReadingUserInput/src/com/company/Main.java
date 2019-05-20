package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    //Set up scanner
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your year of birth: ");
        int yearOfBirth = scanner.nextInt();
        scanner.nextLine(); // handle next line character (enter key)


        System.out.println("Enter you name: ");
        //Read line of string input
        String name = scanner.nextLine();
        //Calculate age
        int age = 2019 - yearOfBirth;

        //Print out input
        System.out.println("Your name is " + " " + name + ", and you are " + age + " years old.");

        //close scanner
        scanner.close();
    }
}
