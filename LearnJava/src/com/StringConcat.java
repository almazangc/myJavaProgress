package com;

import java.util.Scanner;

public class StringConcat {

    public static String concatenateStringsWithoutDigits(String[] strings) {

        StringBuilder stringBuilder = new StringBuilder();

        for (String s:strings) {
            stringBuilder.append(s);
        }

        return stringBuilder.toString().replaceAll("\\d", "");

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strings = scanner.nextLine().split("\\s+");
        String result = concatenateStringsWithoutDigits(strings);
        System.out.println(result);
    }
}
