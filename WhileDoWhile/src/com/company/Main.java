package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int count = 1;
        while(count != 6){
            System.out.println("Count value is " + count);
            count++;
        }

        count = 1;
        do {
            System.out.println("Count value was " + count);
            count++;
        } while (count != 6);

        int number = 4;
        int finishNumber = 20;
        int evenCount = 0;

        while(number <= finishNumber){
            number++;
            if(!isEvenNumber(number)){
                continue;
            }
            if (evenCount == 5){
                break;
            }
            evenCount++;
            System.out.println("Even number " + number);
        }
        System.out.println("Count of even numbers found: " + evenCount);

    }
    //While loop challenge
    public static boolean isEvenNumber(int num){
        if ((num % 2) == 0){
            return true;
        }else {
            return false;
        }
    }
}
