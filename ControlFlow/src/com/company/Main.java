package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // If statement example
//        int value = 1;
//        if (value == 1){
//            System.out.println("Value was 1");
//        }else if (value == 2){
//            System.out.println("Value was 2");
//        }else {
//            System.out.println("Was not 1 or 2");
//        }

        // Switch statement
        int switchValue = 3;
        switch(switchValue){
            case 1:
                System.out.println("Value was 1");
                break;

            case 2:
                System.out.println("Value was 2");
                break;

            //Switch statement shortcut
            case 3: case 4: case 5:
                System.out.println("was a 3, or 4, or a 5");
                System.out.println("Actually it was a " + switchValue);
                break;

            default:
                System.out.println("Was not 1 or 2");
                break;
        }
    }
}
