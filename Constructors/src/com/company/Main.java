package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //new instance of bank class
        Bank bobsAccount = new Bank(12345, 123.45, "Yahya", "123@123.com", "1234567890");
        System.out.println(bobsAccount.getAccountNumber());
        System.out.println(bobsAccount.getBalance());
    }
}
//Constructors let you set values easier
//Automatically created for you by java with the new keyword