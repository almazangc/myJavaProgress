package com.almazan;

import java.util.Scanner;

/**
 * Programming Languages Laboratory
 * Lab Activity - Task 1
 *
 * @author Almazan, Gilbert C.
 * @date 12/10/21
 */

public class Program {

    // Create a Scanner object statement
    final static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        String name; //Declaration statement, variable
        name = getName(); //method invocation statement
        askUser(name);

        //askUser(getName());

        //Conditional Expression
        String line = (name.equals("OWO") ? "???: Better sue the company" : "Author: Assistant bot defective!!");
        System.out.println(line);
    }

    /**
     * Prompt the user to enter desired name;
     * @return String user input name
     */
    public static String getName() {
        // method invocation statement
        System.out.println("Hello, Nice to meet you!");
        System.out.println("I am your assistant today.");
        System.out.print("What should I, call you: ");
        return scan.nextLine();
    }

    /**
     * Prompt the user to select an action
     * @param name
     */
    public static void askUser(String name) {
        clearLine(); //// method invocation statement
        System.out.println("Bleep, Bloop, What should I do today?");
        System.out.println("""
                Choices:
                \t1 | Clean the house
                \t2 | Cook food
                \t3 | Stand by
                \t4 | Shutdown...""");
        System.out.print("Enter selected action: ");
        botAction(scan.nextLine(), name);
    }

    /**
     * Display corresponding action entered by user
     * @param input string use to display corresponding selected action of user
     * @param name
     */
    public static void botAction(String input, String name) {
        //Conditional Statement
        switch (input) {
            case "1":
                clearLine();
                System.out.println("""
                        Initiating cleaning mode...
                        Bleep.. Bloop....
                        Complete.. Status Cleaning
                        Cleaning
                        Dust... Dust...
                        Bot malfunction, exit action
                        Bleeeh... Blfgsdhj... Shutting Down""");
                break;
            case "2":
                clearLine();
                System.out.println("""
                        Checking your favorite food....
                        Beep..... Beep....
                        Found....
                        Checking food materials
                        Materials OK
                        Cooking.....
                        Err...Trouble
                        Bot overload... Shutting down""");
                break;
            case "3":
                clearLine();
                System.out.println("Stand by mode.... Initiated");
                System.out.print("Press enter any key to exit stand by mode...");
                scan.nextLine();
                clearLine();
                askUser(name); //method loop
                break;
            case "4":
                clearLine();
                System.out.println("Shutting down.......");
                break;
            default:
                clearLine();
                System.out.println("Err.. Input " + input + "  not found Err..." +
                        "\nEnter a valid input please");
                System.out.print("Press enter to continue.....");
                scan.nextLine();
                clearLine();
                askUser(name); //method loop
                break; //Noise word if adding break at default:
        }
    }

    /**
     * Display 70 new line on console
     */
    public static void clearLine() {
        for (int i = 0; i <= 70; i++) {
            System.out.println();
        } //{curly brace noise word }
    }
}
