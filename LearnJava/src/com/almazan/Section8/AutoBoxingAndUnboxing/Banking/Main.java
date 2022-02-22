package com.almazan.Section8.AutoBoxingAndUnboxing.Banking;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static Bank bank = new Bank("NewBank");

    public static void main(String[] args) {

        System.out.println("Welcome to bank: " + bank.getName());
        printOptions();

        boolean quit = false;
        while(!quit){
            System.out.print("Press and Enter corresponding actions number displayed: ");
            int userSelection = scanner.nextInt();
            scanner.nextLine(); //Handles Enter Key

            switch(userSelection){
                case 0:
                    viewCustomers();
                    break;
                case 1:
                    addBranch();
                    break;
                case 2:
                    addCustomer();
                    break;
                case 3:
                    addTransaction();
                    break;
                case 4:
                    quit = true;
                    System.out.println("Thank you for using this portal. WE FIND WAYS!!! LOL");
                    break;
                case 5:
                    printOptions();
                    break;
                default:
                    System.out.println("Entered number does not much with the system. \n Please enter a valid one");
            }
        }
    }

    public static void printOptions(){
        System.out.println("Available options are: " +
                "\n0 - View all customers." +
                "\n1 - Add a new bank branch." +
                "\n2 - Add a new customer." +
                "\n3 - Add a new customer transaction." +
                "\n4 - Quit" +
                "\n5 - Display all available options.");
    }

    public static void viewCustomers(){
        System.out.print("Enter name of branch: ");
        String nameOfBranch = scanner.nextLine();
        System.out.print("Do you want to see their transactions(Yes/No):");
        String print = scanner.nextLine();

        boolean printTransactions = false;
        if(print.equalsIgnoreCase("yes"))
            printTransactions = true;

        if(bank.listCustomers(nameOfBranch,printTransactions))
            System.out.println("List Completed.");
        else
            System.out.println(nameOfBranch + " not found.");
    }

    public static void addBranch(){
        System.out.print("Enter name for new branch: ");
        String nameOfBranch = scanner.nextLine();
        if(bank.addBranch(nameOfBranch))
            System.out.println(nameOfBranch + " created successfully.");
         else
            System.out.println(nameOfBranch + " already exists!");
    }

    public static void addCustomer(){
        System.out.print("Enter name of branch the customer want to join: ");
        String nameOfBranch = scanner.nextLine();

        System.out.print("Enter name of new customer: ");
        String nameOfCustomer = scanner.nextLine();

        System.out.print("Enter initial transaction amount: ");
        double initialTransaction = scanner.nextDouble();
        scanner.nextLine();

        if(bank.addCustomer(nameOfBranch,nameOfCustomer,initialTransaction))
            System.out.println(nameOfCustomer + " added successfully to " + nameOfBranch + " with initial amount of " + initialTransaction);
        else
            System.out.println("Cannot add customer.(Entered Branch does not exist or Customer already present in selected branch.");
    }

    public static void addTransaction(){
        System.out.print("Enter name of branch : ");
        String nameOfBranch = scanner.nextLine();

        System.out.print("Enter name of customer: ");
        String nameOfCustomer = scanner.nextLine();

        System.out.print("Enter transaction amount: ");
        double transaction = scanner.nextDouble();
        scanner.nextLine();

        if(bank.addCustomerTransaction(nameOfBranch,nameOfCustomer,transaction))
            System.out.println("Transaction amount of " + transaction + " added to " + nameOfCustomer + "'s account at " + nameOfBranch + " branch.");
        else
            System.out.println("Cannot add transaction.(Entered Branch does not exist or Customer already present in selected branch.");
    }
}

