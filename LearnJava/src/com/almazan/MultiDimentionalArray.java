package com.almazan;

import java.util.Scanner;

public class MultiDimentionalArray {

    public static void main(String[] args) {
        System.out.print("Enter odd number: ");
        int n = new Scanner(System.in).nextInt();

        for (int newLine = 0; newLine < n; newLine++) {

            for (int whiteSpace = 0; whiteSpace < n; whiteSpace++) {

                if (whiteSpace == n / 2 || newLine == n / 2 || whiteSpace == newLine || whiteSpace == n - (newLine + 1)) { //Column Row Diagonal \ Diagonal /

                        System.out.print("X");

                } else {

                    System.out.print("_");

                }

                System.out.print(" ");

            }
            System.out.println();
        }
    }
}
