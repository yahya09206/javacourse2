package com.company;

public class VipCustomer {
    //Fields for vip customer
    private double creditLimit;
    private String name;
    private String emailAddress;

    public VipCustomer(){
        this(123.45,"mike","mike@123.com");
        System.out.println("Empty constructor called");
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
