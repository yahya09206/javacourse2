package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int count = 0;
        while(count !=6 ){
            System.out.println("Count value is " + count);
            count++;
        }

        count = 6;
        do {
            System.out.println("Count value was " + count);
            count++;

            if (count > 100){
                break;
            }

        }while (count != 6);

        int number = 4;
        int finishNum = 20;
        int totalNum = 0;
        while(number <= finishNum){
            number++;
            if (!isEvenNumber(number)){
                continue;
            }
            totalNum++;
            if (totalNum >= 5){
                break;
            }
            System.out.println("Even number " + number);
        }
        System.out.println("Total amount of even numbers is " + totalNum);
    }


    // While loop challenge
    public static boolean isEvenNumber(int num){
        if(num % 2 == 0){
            return true;
        }else {
            return false;
        }
    }
}
