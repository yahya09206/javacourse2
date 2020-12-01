package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Bank bobsBank = new Bank();
        bobsBank.withdrawFunds(100.00);

        bobsBank.depositFunds(50.0);
        bobsBank.withdrawFunds(100.00);

        bobsBank.depositFunds(51.0);
        bobsBank.withdrawFunds(100.00);
    }
}
