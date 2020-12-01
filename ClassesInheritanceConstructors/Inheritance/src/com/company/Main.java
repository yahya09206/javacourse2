package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Bank bobsBank = new Bank(); //12345, 435.0, "John", "john@email.com",
                //"2063030838");

        System.out.println(bobsBank.getAccountNumber());
        System.out.println(bobsBank.getBalance());
        bobsBank.withdrawFunds(100.00);

        bobsBank.depositFunds(50.0);
        bobsBank.withdrawFunds(100.00);

        bobsBank.depositFunds(51.0);
        bobsBank.withdrawFunds(100.00);

        Bank timsBank = new Bank("tim", "tim@email.com", "12345");
        System.out.println(timsBank.getAccountNumber() + " name " + timsBank.getName());
    }
}
