package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("10,000 at 2% interest = " + calculateInterest(10000.00, 2.0));
        System.out.println("10,000 at 3% interest = " + calculateInterest(10000.00, 3.0));
        System.out.println("10,000 at 4% interest = " + calculateInterest(10000.00, 4.0));
        System.out.println("10,000 at 5% interest = " + calculateInterest(10000.00, 5.0));

        for (int i = 0; i < 5; i++){
            System.out.println("Loop " + i + " hello!");
        }

        for (int i = 2; i < 9; i++){
            System.out.println("10,000 at " + i + "% interest = " + calculateInterest(10000, i));
        }

        for (int i = 8; i >= 2; i--){
            System.out.println("10,000 at " + i + "% interest = " + calculateInterest(10000, i));
        }

    }

    public static boolean isPrime(int n){
        if (n == 1) {
            return false;
        }
        for (int i = 2; i <= n/2; i++){
            if (n % 1 == 0){
                return false;
            }
        }
        return true;
    }

    public static double calculateInterest(double amount, double interestRate){
        return(amount * (interestRate/100));
    }
}
