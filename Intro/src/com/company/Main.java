package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Hello World");
        System.out.println("Hello Yahya");

        //Variables
        int myFirstNumber = (5 + 10) + (2 * 10);
        int mySecondNumber = 12;
        int myThirdNumber = 6;
        int myTotal = myFirstNumber + mySecondNumber + myThirdNumber;
        System.out.println(myTotal);

        //Variables challenge
        int myLastOne = 1000 - myTotal;
        System.out.println(myLastOne);

        int myValue = 10000;

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myMaxIntValue);
        System.out.println("Busted Max value = " + (myMaxIntValue + 1));
        System.out.println("Busted Min value = " + (myMinIntValue - 1));

        //Floating point numbers
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float minimum value = " + myMinFloatValue);
        System.out.println("Float maximum value = " + myMaxFloatValue);

        double myMindoubleValue = Double.MIN_VALUE;
        double myMaxdoubleValue = Double.MAX_VALUE;
        System.out.println("Double minimum value = " + myMindoubleValue);
        System.out.println("Double maximum value = " + myMaxdoubleValue);

        int myIntValue = 5 / 3;
        float myFloatValue = 5f / 3f;
        double myDoubleValue = 5.00 / 3.00;
        System.out.println("My int value = " + myIntValue);
        System.out.println("My float value = " + myFloatValue);
        System.out.println("My double value = " + myDoubleValue);

        //Floating point challenge
        double pounds = 36;
        double toKG = pounds * 0.45359237;
        System.out.println(toKG);

        //Char And Boolean
        char myChar = 'D';

        //String
        String myString = "This is a string";
        System.out.println("myString is equal to " + myString);
        myString = myString + ", and this is more.";
        System.out.println("myString is equal to " + myString);

        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println(numberString);

    }
}

//Defining the main method
    //public is an access modifier we discussed when defining the class in the last video - same principle
    //static is a java keyword that needs an understanding of other concepts, for now, know that we need to have static for java to find out method to run the code we are going to add
    //code block is used to define a block of code. it's mandatory to have one in a method declaration and it's here where we will be adding statements to perform certain tasks
    //Statement - this is a complete command to be executed and can include one or more expressions


//What are variables
    //Variables are w way to store information in our computer. Variables that we define in a program can be accessed by a name we give them, and the computer does the hard work of figuring out where they get stored in the computers random access memory
    //A variable, as the name suggests can be changed, in other words, it's contents are variable.
    //What we have to do is tell the computer what type of information we want to store in the variable, and then give it a name
    //There are lots of different types of data we can define for our variables. Collectively these are known as data types. As you may have guess, data types are keywords in java.
    //Let's start out by defining a variable of type 'int' - 'int' being an abbreviation for integer, a whole number(that is a number without any decimal points).
    //To define a variable we need to specify the data type, then give our variable a name, and optionally add an expression to initialize the variable with a value

//Declaration Statement
    //Used to define a variable by indication the data type, and the name, and optionally to set the variable to a certain value

//Expression
    //This is a construct that evaluates to a single value

//String Literal
    //A sequence of characters surrounded by quotation marks

//Primitive Types
    //In Java primitive types are the most basic data types. The int is one of eight primitive types.
    //The eight primitive data types in java are boolean, byte, char, short, int, long, float and double. Consider these types as the building blocks of data manipulation.

//Wrapper classes
    //Java uses the concept of a wrapper class for all eight primitive types - In the case of an int, we can use Integer, and by that it gives us ways to perform operations on an int

//Overflow and Underflow in java
    //If you try and put a value larger than the maximum value in java, or a value smaller than the minimum value in java, then you will get an overflow in the case of the maximum value or an underflow in the case of the minimum
    //The computer just skips back to the minimum number or the maximum number, which is usually not what you want. It's an important concept to be aware of.

//Size of Primitive types and Width
    //A byte occupies 8 bits. A bit is not directly represented in a primitive type - We have a boolean which is not really the same thing we will discuss in a future video. So a byte occupies 8 bits. We say that byte has a width of 8
    //A short can store a large range of numbers and occupies 16 bits, and has a width of 16
    //An int, has a much larger range as we know, and occupies 32 bits, and has a width of 32
    //The point here is that each primitive type occupies a different amount of memory - we can see that an int needs four times the amount of space, than a byte does for example

//Casting in Java
    //Casting means to treat or convert a number from one type to another. We put the type we want the number to be in parenthesis.
    //Available in other languages as well

//Floating Point Numbers
    //Unlike whole numbers, floating point numbers have fractional parts that we express with a decimal point
    //Floating point numbers are also known as real numbers. We use a floating point when we need more precision in calculations

//Single And Double Precision
    //Precision refers to the format and amount of space occupied by the type. Single precision occupies 32 bits(so it has a width of 32) and a Double precision occupies 64 bits and thus has a width of 64
    //In general float and double are great for general floating point operations. But both are not great to use where precise calculations are required - this is due to a limitation with how floating point numbers are stored, and not a Java problem as such
    //Java has a lass called BigDecimal that overcomes this. We will talk more about that later in the course. For now just keep in the back of your mind that when precise calculations are necessary, such as when performing currency calculations, floating-point types should not be used.
    //Better for general calculations

//Char and boolean type
    //A char occupies two bytes of memory, or 16 bits and thus has width of 16. The reason it's not just a single byte is that it allows you to store unicode characters

//String
    //The string is a data type in java, which is not a primitive type. It's actually a class, but it enjoys a bit of favoritism in java to make it easier to use than a regular class
    //A string is a sequence of characters. In the case of the char which you can see above which we discussed in the previous video, it could contain a single character only