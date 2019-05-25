package com.company;

public class VipClass {
    private String name;
    private double creditLimit;
    private String emailAddress;

    public VipClass() {
        this("mike", 123.00, "joe@email.com");
        System.out.println("Empty constructor was called");
    }

    public VipClass(String name, double creditLimit) {
        this(name, creditLimit, "Joe@email.com");
        System.out.println("Constructor with fields was called");

    }

    public VipClass(String name, double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }


    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
