package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        BankAccount account = new BankAccount(); //12345, 0.00, "Yahya", "joe@email.com", "3004939202");
        System.out.println(account.getAccountNumber());
        System.out.println(account.getBalance());

        BankAccount timsAccount = new BankAccount("Tim", "Tim@email.com", "12345");
        System.out.println(timsAccount.getPhoneNumber() + " name " + timsAccount.getName());

        //Constructor Challenge
        VipClass vipClass = new VipClass("joe", 433.55);
        System.out.println(vipClass.getName() + " credit limit is " + vipClass.getCreditLimit());
    }
}
