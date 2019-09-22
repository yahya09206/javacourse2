package com.company;

public class Main {

    public static void main(String[] args) {
        // define array
        int[] myIntArray =  new int[25];//{1,2,3,4,5,6,7,8,9,10};
        // Save value of 50 into element 6 since arrays have a 0-based index
//        myIntArray[5] = 50;
//        double[] myDoubleArray = new double[10];
//        System.out.println(myIntArray[0]);
//        System.out.println(myIntArray[6]);
//        System.out.println(myIntArray[8]);

        // use for loop to run through array
        for (int i = 0; i < myIntArray.length; i++) {
            myIntArray[i] = i * 10;
        }
        printArray(myIntArray);

    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + ", value is " + array[i]);
        }
    }

}
