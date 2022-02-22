package com.almazan.Section9.Interface.Phone;

public class Main {

    public static void main(String[] args) {
        ITelephone timsPhone; //new object
        timsPhone = new Phone(123456);
        timsPhone.powerOn();
        timsPhone.callPhone(123456);
        timsPhone.answer();
    }
}

