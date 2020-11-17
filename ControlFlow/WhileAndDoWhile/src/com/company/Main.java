package com.company;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        int count = 1;
////        while (count != 6){
////            System.out.println("Count value is " + count);
////            count++;
////        }
////
////        while(true){
////            if (count == 6){
////                break;
////            }
////            System.out.println("Count value is " + count);
////            count++;
////        }
//
//        count = 1;
//        do {
//            System.out.println("Count value was " + count);
//            count++;
//        }while (count != 6);

        int number = 4;
        int endNumber = 20;
        int count = 0;

        while(number <= endNumber){
            number++;
            if (!isEvenNumber(number)){
                continue;
            }
            System.out.println("Even number " + number);
            count++;
            if (count == 5){
                break;
            }
        }
        System.out.println(count + " even numbers found");

    }

    //While loop challenge
    public static boolean isEvenNumber(int num){

       if (num % 2 == 0){
           return true;
       }
       return false;
    }


    public static int getEvenDigitSum(int number){
        int lastDigit = 0;

        if(number < 0){
            return -1;
        }else {
            int sum = 0;
            do {
                //find last digit of a number
                lastDigit = number % 10;

                //Check if its even
                if (lastDigit % 2 == 0) {
                    sum += lastDigit % 10;
                }
                //Remove last digit of number
                number /= 10;
            } while (number > 0);
            return sum;
        }
    }
}
