package com.company;

public class VipCustomer {
    //Fields for vip customer
    private double creditLimit;
    private String name;
    private String emailAddress;

    public VipCustomer(){
        this(123.45, "mike", "mike@123.com");
        System.out.println("Empty constructor called");
    }

    //constructor with 1 default value
    public VipCustomer(double creditLimit, String name){
        this(creditLimit, name, "jimm@123.com");
        this.creditLimit = creditLimit;
        this.name = name;
    }

    public VipCustomer(double creditLimit, String name, String emailAddress){
        this.creditLimit = creditLimit;
        this.name = name;
        this.emailAddress = emailAddress;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getName() {
        return name;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
