package com.company;

public class BankAccount {
    private int accountNumber;
    private double balance;
    private String name;
    private String email;
    private String phoneNumber;

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void depositFunds(double depositAmount){
        this.balance += depositAmount;
        System.out.println("Your new balance is " + this.balance);
    }

    public void withdraw(double withdrawAmount){
        if (this.balance - withdrawAmount < 0 ){
            System.out.println("Sorry not enough funds available");
        }else {
            this.balance -= withdrawAmount;
            System.out.println("You withdrew " + withdrawAmount + ". You have " + this.balance + " dollars left.");
        }
    }

}
