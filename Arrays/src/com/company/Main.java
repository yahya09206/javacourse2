package com.company;

import java.util.Scanner;

public class Main {

    //Scanner that accepts input
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myIntegers = getIntegers(5);
        for (int i = 0; i < myIntegers.length; i++){
            System.out.println("Elements " + i + ", typed value was " + myIntegers[i]);
        }
        System.out.println("The average is " + getAverage(myIntegers));

    }

    public static int[] getIntegers(int number){
        System.out.println("Enter " + number + " integer values.\r");
        int[] values = new int[number];

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

}


    //Standard definition array
//    int[] myIntArray = new int[25]; //{1,2,3,4,5,6,7,8,9,10};
//        for (int i = 0; i < myIntArray.length; i++){
//        myIntArray[i] = i*10;
//        }
//        for (int i = 0; i < myIntArray.length; i++){
//        System.out.println("Element " + i + ", value is " + myIntArray[i]);
//        }
//        printArray(myIntArray);

//    public static void printArray(int[] array){
//        for (int i = 0; i < array.length; i++){
//            System.out.println("Element " + i + ", value is " + array[i]);
//        }
//    }