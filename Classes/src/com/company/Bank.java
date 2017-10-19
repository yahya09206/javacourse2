package com.company;

public class Bank {
    //private fields
    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    //method for depositing funds
    public static double depositFunds(double balance){
        double deposit = 0;
        deposit += balance;
        System.out.println("you deposited " + deposit + " your new balance is: " + balance);
    }

    //getters and setters for fields
    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
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
}
