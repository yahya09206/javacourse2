package com.company;

public class Bank {

    private int     accountNumber;
    private double  balance;
    private String  name;
    private String  email;
    private String  phoneNumber;


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

