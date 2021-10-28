package com;

/**
 * Fibonacci Number - This program display the first n fibonacci number
 *
 * @author  ALMAZAN, Gilbert C. & ROSAS, Ivan Jomil M.
 * @date   2021-10-26
 */

import java.util.Scanner;

public class fibonacci_sequence {

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter a number: ?");
        long n = scan.nextInt(); //ask user

        System.out.printf("%s%d%s","The first ", n, " Fibonacci numbers are: ");
        for(long i = 1; i < n + 1; i++){
            System.out.print(recursion(i) +" ");
        }
    }

    private static int recursion(long i) {
        if(i == 1 || i == 2){ //Starting number 1 1
            return 1;
        }
        return recursion(i-2) + recursion(i-1); //recursion for next number
    }
}

