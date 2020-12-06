package com.company;

public class Main {

    public static void main(String[] args) {

        ITelephone timsPhone;
        timsPhone = new DeskPhone(2063030838);
        timsPhone.powerOn();
        timsPhone.callPhone(2063030838);
        timsPhone.answer();
    }
}
