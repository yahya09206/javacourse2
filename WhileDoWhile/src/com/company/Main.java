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
    }

    // While loop challenge

}
