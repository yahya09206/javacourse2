package com.company;

import java.util.Scanner;

public class Main {

    //Scanner that accepts input
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myIntegers = getIntegers(5);
        int[] sorted = sortIntegers(myIntegers);
        printArray(sorted);


    }

    public static int[] getIntegers(int capacity){
        int[] array = new int[capacity];
        System.out.println("Enter " + capacity + " integer values");
        for (int i = 0; i < array.length; i++){
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++){
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }

    public static int[] sortIntegers(int[] array){
        int[] sortedArray = new int[array.length];
        for (int i = 0; i < array.length; i++){
            sortedArray[i] = array[i];
        }
        boolean flag = true;
        int temp;
        while (flag){
            flag = false;
            for (int i = 0; i < sortedArray.length - 1; i++){
                if (sortedArray[i] < sortedArray[i+1]){
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
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

//    public static int[] printArray(int []){
//        int[] myIntegers = getIntegers(5);
//        for (int i = 0; i < myIntegers.length; i++){
//            System.out.println("Elements " + i + ", typed value was " + myIntegers[i]);
//        }
//    }

//    public static void printArray(int[] array){
//        for (int i = 0; i < array.length; i++){
//            System.out.println("Element " + i + ", value is " + array[i]);
//        }
//    }

//    public static int[] getIntegers(int number){
//        System.out.println("Enter " + number + " integer values.\r");
//        int[] values = new int[number];
//
//        for (int i = 0; i < values.length; i++){
//            values[i] = scanner.nextInt();
//        }
//        return values;
//    }




//    public static double getAverage(int[] array){
//        int sum = 0;
//        for (int i = 0; i < array.length; i++){
//            sum += array[i];
//        }
//        return (double) sum / (double)array.length;
//    }
