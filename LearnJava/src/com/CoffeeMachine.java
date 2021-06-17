package com;

import java.util.Scanner;

public class CoffeeMachine {
    private static final Scanner sc = new Scanner(System.in);
    private static int machineCash = 550;
    private static int mlOfWater = 400;
    private static int mlOfMilk = 540;
    private static int gramOfBeans = 120;
    private static int disposableCup = 9;

    private static boolean exit = false;

    public static void main(String[] args) {
        do {
            displayAction();
        } while (!exit);
    }

    private static void remaining () {
        System.out.println("The coffee machine has:");
        System.out.println(mlOfWater + " ml of water");
        System.out.println(mlOfMilk + " ml of milk");
        System.out.println(gramOfBeans + " g of coffee beans");
        System.out.println(disposableCup + " disposable cups");
        System.out.println(machineCash + " of money");
    }

    private static void displayAction () {
        System.out.println("Write action (buy, fill, take, remaining, exit): ");
        String selectedAction = sc.nextLine();

        switch (selectedAction) {
            case "buy":
                buy();
                break;
            case "fill":
                fill();
                break;
            case "take":
                take();
                break;
            case "remaining":
                remaining();
                break;
            case "exit":
                exit = true;
                break;
        }
    }

    private static void buy() {
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuchino:");
        String buySelection = sc.next();

        switch (buySelection) {
            case "1": //espresso
                storageUpdate(250,0,16,4);
                break;
            case "2": //latte
                storageUpdate(350,75,20,7);
                break;
            case "3": //cappuchino
                storageUpdate(200,100,12,6);
                break;
            case "back":
                break;
        }
    }

    private static void storageUpdate (int water, int milk, int beans, int cash) {

        if (mlOfWater < water) {
            System.out.println("Sorry, not enough water!");
        } else if (mlOfMilk < milk) {
            System.out.println("Sorry, not enough milk!");
        } else if (gramOfBeans < beans) {
            System.out.println("Sorry, not enough bean!");
        } else if (disposableCup == 0) {
            System.out.println("Sorry, not enough cup!");
        } else {
            System.out.println("I have enough resources, making you a coffee!");

            mlOfWater -= water;
            mlOfMilk -= milk;
            gramOfBeans -= beans;
            machineCash += cash;
            disposableCup -= 1;
        }
    }

    private static void fill() {
        System.out.println("Write how many ml of water you want to add: ");
        mlOfWater += sc.nextInt();
        System.out.println("Write how many ml of milk you want to add: ");
        mlOfMilk += sc.nextInt();
        System.out.println("Write how many grams of coffee beans you want to add: ");
        gramOfBeans += sc.nextInt();
        System.out.println("Write how many disposable cups of coffee you want to add: ");
        disposableCup += sc.nextInt();
    }

    private static void take() {
        System.out.println("I gave you $" + machineCash);
        int takenCash = machineCash;
        machineCash = 0;
    }
}
