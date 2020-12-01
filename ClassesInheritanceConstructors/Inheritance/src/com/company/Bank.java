package com.company;

public class Bank {

    private int     accountNumber;
    private double  balance;
    private String  name;
    private String  email;
    private String  phoneNumber;

    // Constructor for easy access in main method
    public Bank(int accountNumber, double balance, String name, String email, String phoneNumber){
        System.out.println("Constructor with parameters called");
        this.accountNumber  = accountNumber;
        this.balance        = balance;
        this.name           = name;
        this.email          = email;
        this.phoneNumber    = phoneNumber;
    }


    public Bank(){
        this(56789, 2.50, "Default name", "default address",
                "default phone number");
        System.out.println("Empty constructor called");
    }

    public Bank(String name, String email, String phoneNumber) {
        this(999999, 100.55, name, email, phoneNumber);
        this.name           = name;
        this.email          = email;
        this.phoneNumber    = phoneNumber;
    }

    // getters and setters for fields
    public int getAccountNumber(){
        return this.accountNumber;
    }

    public double getBalance(){
        return this.balance;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void depositFunds(double add){
        this.balance += add;
        System.out.println("Deposit of " + add + ", Your new account balance is " + balance);
    }

    public void withdrawFunds(double subtract){
        if (this.balance - subtract < 0){
            System.out.println("Not enough funds available");
        } else {
            this.balance -= subtract;
            System.out.println("Withdrawal of $" + subtract + ", Your new account balance is $" + this.balance);
        }

    }


}

