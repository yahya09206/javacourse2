package com.company;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
	    //Declare an array
        //int[] myIntArray = new int[10];

        //Access array element
        //myIntArray[5] = 50;
        reverse("Mississippi");

        double[] myDoubleArray = new double[10];

        //Retrieve value from array
        //System.out.println(myIntArray[5]);

        //Shorthand for declaring array
        int[] myIntArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(myIntArray[6]);

        int[] myIntArray2 = new int[10];
        //Using for loop to init array
        for (int i = 0; i < myIntArray2.length; i++){
            myIntArray2[i] = i * 10;
        }

        printArray(myIntArray2);

        //Prompt user for input
        int[] myIntegers = getIntegers(5);
        for (int i = 0; i < myIntegers.length; i++){
            System.out.println("Element " + i + ", typed value was " + myIntegers[i]);
        }
        System.out.println("The average is " + getAverage(myIntegers));


    }

    public static int[] getIntegers(int number){
        System.out.println("Enter " + number + " integer values.\r");
        int[] values = new int[number];

        //traverse through array
        for (int i = 0; i < values.length; i++){
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static double getAverage(int[] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++){
            sum += array[i];
        }
        return (double) sum / (double)array.length;
    }

    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++){
            System.out.println("Element " + i + ", value is " + array[i]);
        }
    }

    public static String reverse(String text){
        String result = "";
        for (int i = 0; i < text.length(); i++){
            result = text.charAt(i) + result;
        }
        System.out.println(result);
        return result;

    }

}
