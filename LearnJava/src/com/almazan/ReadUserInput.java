package com.almazan;

import java.util.Scanner;

public class ReadUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your year of birth:");

        boolean hasNextInt = scanner.hasNextInt(); //Checking Values entered if Integer

        if(hasNextInt) {
            int yearOfBirth = scanner.nextInt();
            scanner.nextLine(); // handle next line character (enter key)

            System.out.print("Enter your name: ");
            String name = scanner.nextLine();
            int age = 2022 - yearOfBirth;

            if(age >= 0 && age <= 100) {
                System.out.print("Your name is " + name + ", and you are " + age + " years old.");
            } else {
                System.out.print("Invalid year of birth");
            }
        } else {
            System.out.print("Unable to parse year of birth.");
        }

        scanner.close(); //Closing Scanner
    }
}
