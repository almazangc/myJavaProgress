package com;
import java.util.Scanner;

/**
 * Fibonacci Number - This program generates and display the first n fibonacci number
 *
 * @author  ALMAZAN, Gilbert C. & ROSAS, Ivan Jomil M.
 * @date   2021-10-26
 */

public class fibonacci_number {

    private static final Scanner scan = new Scanner(System.in);
    private static int n;

    public static void main(String args[]) {
        System.out.print("Enter a number: ?"); n = scan.nextInt(); //ask user

        System.out.printf("%s%d%s","The first ", n, " Fibonacci numbers are: ");
        for(int i = 1; i < n + 1; i++){
            System.out.print(recursion(i) +" ");
        }
    }

    private static int recursion(int i) {
        if(i == 1 || i == 2){ //Starting number 1 1
            return 1;
        }
        return recursion(i-2) + recursion(i-1); //recursion for next number
    }
}
