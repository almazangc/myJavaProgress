package com.almazan;

public class EnglishAlphabet {

    public static StringBuilder createEnglishAlphabet() {
        // write your code here
        StringBuilder alphabet = new StringBuilder();
        
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            alphabet
                .append(ch)
                .append(" ");
        }
        return alphabet;
    }

    public static void main(String[] args) {
        System.out.println(createEnglishAlphabet());
    }
}
