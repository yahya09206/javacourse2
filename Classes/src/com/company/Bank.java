package com.company;

public class Bank {
    //private fields
    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    //method for depositing funds
    public void depositFunds(double deposit){
        this.balance += deposit;
        System.out.println("you deposited " + deposit + " your new balance is: " + balance);
    }

    public void withdrawFunds(double balance){
        double withdraw = 0;
        if(withdraw > balance){
            System.out.println("Insufficient funds");
        }else{
            withdraw -= balance;
            System.out.println("You withdrew " + withdraw);
        }
    }

    //getters and setters for fields
    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
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
