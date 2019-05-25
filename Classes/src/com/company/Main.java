package com.company;

public class Main {

    public static void main(String[] args) {

        // Create Car Object
        Car audi = new Car();
        Car tesla = new Car();
        audi.setModel("a8");
        System.out.println("Model is " + audi.getModel());

        // Classes challenge
        BankAccount account = new BankAccount();
        account.setAccountNumber(1234);
        System.out.println("Account number is " + account.getAccountNumber());
        account.depositFunds(300.00);
        System.out.println(account.getBalance());
        account.withdraw(200);
        account.depositFunds(100000);

    }
}