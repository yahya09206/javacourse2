package com.company;

import java.util.Scanner;

public class Main {

    //Scanner that accepts input
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myIntegers = getIntegers(5);

    }

    public static int[] getIntegers(int number){
        System.out.println("Enter " + number + " integer values.\r");
        int[] values = new int[number];

        for (int i = 0; i < values.length; i++){
            values[i] = scanner.nextInt();
        }
        return values;
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