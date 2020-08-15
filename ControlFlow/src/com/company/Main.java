package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int value = 1;
        if(value === 1){
            System.out.println("Value was 1")
        }else  if(value === 2){
            System.out.println("Value was 3")
        }else {
            System.out.println("Was not 1 or 2");
        }

        //Switch Statement
        int switchValue = 1;

        switch(switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;

            case 2:
                System.out.println("Value was 2");
                break;
        }
    }
}
