package com.company;

public class Main {

    public static void main(String[] args) {
        //Hello World
        System.out.println("Hello World");

        //Variables
        int myFirstNumber = (10 + 5) + (2 * 10);
        int mySecondNumber = 12;
        int myThirdNumber = myFirstNumber * 2;
        int sum = myFirstNumber + mySecondNumber + myThirdNumber;
        int myLastOne = 1000 - sum;

        //Print out to console
        System.out.println(myLastOne);

        //Primitive Types
        int value = 10000;

        //Int occupies 32 bits
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minumum Value: " + myMinIntValue);
        System.out.println("Integer Maximum Value: " + myMaxIntValue);
        //OverFlow
        System.out.println("Busted Max value = " + (myMaxIntValue + 1));
        //UnderFlow
        System.out.println("Busted Min value = " + (myMinIntValue - 1));

        //Byte occupies 8 bits
        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Min Value: " + myMinByteValue);
        System.out.println("Byte Max Value: " + myMaxByteValue);


        //Short occupies 16 bits
        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Min Value: " + myMinShortValue);
        System.out.println("Short Max Value: " + myMaxShortValue);

        long myLongValue = 100L;
        long myMinlongValue = Long.MIN_VALUE;
        long myMaxlongValue = Long.MAX_VALUE;
        System.out.println("Long Min Value: " + myMinlongValue);
        System.out.println("Long Max Value: " + myMaxlongValue);

        //Challenge
        byte myByte = 10;
        short myShort = 20;
        int myNum = 50;
        long myLong = 50000L + 10L * (myByte + myShort + myNum);
        System.out.println(myLong);

        //Float & Double primitive Types
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float Min Value: " + myMinFloatValue);
        System.out.println("Float Max Value: " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double Min Value: " + myMinDoubleValue);
        System.out.println("Double Max Value: " + myMaxDoubleValue);

        int myIntVal = 5 / 3 ;
        float myFloatVal = 5f / 3f;
        double myDoubleVal = 5d / 3d;
        System.out.println("MyIntVal= " + myIntVal);
        System.out.println("MyFloatVal= " + myFloatVal);
        System.out.println("MyDoubleVal= " + myDoubleVal);

        //Challenge
        double pounds = 200d;
        double convertedWeight = pounds * 0.45359237d;
        System.out.println(convertedWeight);

        //Char
        char myChar = 'D';
        char myUnicodeChar = '\u0044';
        System.out.println(myChar);
        System.out.println(myUnicodeChar);
        char myCopyRightChar = '\u00a9';
        System.out.println(myCopyRightChar);

        //Boolean
        boolean myTrueBooleanValue = true;
        boolean myFalseBooleanValue = false;

        //Operands
        int result = 1 + 2;
        System.out.println("1 + 2 = " + result);
        int previousResult = result;
        System.out.println("previous result = " + previousResult);
        result = result - 1;
        System.out.println("new result " + result);

        result = result * 10;
        System.out.println(result);

        result = result / 5;
        System.out.println("20 / 5 = " + result);

        result = result % 3;
        System.out.println("result % 3 = " + result);
    }
}