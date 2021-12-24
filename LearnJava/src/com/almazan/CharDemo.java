package com.almazan;

public class CharDemo {
    public static void main(String[] args){
        char ch1,ch2;

        ch1 = 69; //code for e
        ch2 = 'Y';

        System.out.println("ch1 and ch2: ");
        System.out.println(ch1 + " " + ch2);

        char a = 0;

        for(int i = 32; i <= 200; i ++){
            a = (char)i;
            System.out.println("i: " + i + "[" + a + "]");
        }
    }
}
