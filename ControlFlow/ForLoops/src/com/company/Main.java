package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println("10,000 at 2% interest = " + calculateInterest(10000.0, 2.0));

        for (int i = 2; i <= 8; i++){
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(10000.0, i)));
        }

        System.out.println("***************");

        for (int i = 8; i >= 2; i--){
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(10000.0, i)));
        }

        int count = 0;
        for (int i = 1; i <= 50; i++){
            if(isPrime(i)){
                System.out.println(i);
                count++;
                if (count == 3){
                    break;
                }
            }
        }
        System.out.println(count + " prime numbers were found");


        //Sum 3 and 5 challenge
        int counts = 0;
        int sum = 0;
        for (int i = 1; i <= 1000; i++){
            //check which numbers are divisible by 3 and 5
            if (i % 3 == 0 && i % 5 == 0){
                System.out.println(i);
                counts++;
                sum += i;
                if(counts == 5){
                    break;
                }
            }
        }
        System.out.println(sum);

    }

    public static double calculateInterest(double amount, double interestRate){
        return (amount * (interestRate / 100));
    }

    //For loop real challenge
    public static boolean isPrime(int n){
        if (n == 1){
            return false;
        }
        for (int i = 2; i <= n / 2; i++){
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }
}
