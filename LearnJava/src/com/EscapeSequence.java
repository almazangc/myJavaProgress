package com;

public class EscapeSequence {
    public static void main(String[] args) {
        char ch = 'a';

        // Unicode for uppercase Greek omega character
        char uniChar = '\u03A9';

        // an array of chars
        char[] charArray = { 'a', 'b', 'c', 'd', 'e' };

        //object character
        Character ch1 = new Character('a');

        //\t tabbing
        System.out.print("\tTab\n");

        //\b backspace
        System.out.print("X\bBackspace");

        //\r Insert a carriage return in the text at this point
        System.out.print("a\n\rreturn");

        //\f formfeed
        System.out.println("\f");

        //\ddd octal char

        //comment print \u000dSystem.out.println("COMMENT PRINT");

    }
}
