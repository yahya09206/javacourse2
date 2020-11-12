package com.company;

public class Main {

    public static void main(String[] args) {
        printDayOfTheWeek(1);
	    int value = 1;
	    if (value == 1){
            System.out.println("Value was 1");
        }else if (value == 2){
            System.out.println("Value was 2");
        }else {
            System.out.println("Value was 3");
        }

	    //Switch statement to clean up preceeding code
        int switchValue = 1;

	    switch(switchValue){
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            default:
                System.out.println("Value was 3");
                break;
        }

        //Switch statement challenge
        char charValue = 'A';

	    switch (charValue){
            case 'A':
                System.out.println("Value was A");
                break;
            case 'B':
                System.out.println("Value was B");
                break;
            case 'C':
                System.out.println("Value was C");
                break;
            case 'D':
                System.out.println("Value was D");
                break;
            case 'E':
                System.out.println("Value was E");
                break;
            default:
                System.out.println("None of the values were found");
                break;
        }
    }
    //2nd switch statement challenge Day of The Week
    public static void printDayOfTheWeek(int day){
        switch(day){
            case 0:
                System.out.println("Sunday");
                break;

            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wendnesday");
                break;

            case 4:
                System.out.println("Thursday");
                break;

            case 5:
                System.out.println("Friday");
                break;

            case 6:
                System.out.println("Saturday");
                break;

            default:
                System.out.println("Invalid day");
                break;
        }
    }

}
