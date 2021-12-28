package com.almazan.Section8.AutoBoxingAndUnboxing.Banking;

import java.util.Scanner;

/*
Your job is to create a simple banking application.

Implement the following classes:

1.Bank

-It has two fields, A String called name and an ArrayList that holds objects of type Branch called branches.

-A constructor that takes a String (name of the bank). It initialises name and instantiates branches.

- And five methods, they are (their functions are in their names):
  - addBranch(), has one parameter of type String (name of the branch) and returns a boolean.
        It returns true if the branch was added successfully or false otherwise.

  - addCustomer(), has three parameters of type String (name of the branch), String (name of the customer), double (initial transaction) and returns a boolean.
        It returns true if the customer was added successfully or false otherwise.

  - addCustomerTransaction(), has three parameters of type String (name of the branch), String (name of the customer), double (transaction) and returns a boolean.
        It returns true if the customers transaction was added successfully or false otherwise.

  - findBranch(), has one parameter of type String (name of the Branch) and returns a Branch.
        Return the Branch if it exists or null otherwise.

  - listCustomers(), has two parameters of type String (name of the Branch), boolean (print transactions) and returns a boolean.
        Return true if the branch exists or false otherwise. This method prints out a list of customers.

2. Branch

  - It has two fields, A String called name and an ArrayList that holds objects of type Customer called customers.

  - A constructor that takes a String (name of the branch). It initialises name and instantiates customers.

  - And five methods, they are (their functions are in their names):

    - getName(), getter for name.

    - getCustomers(), getter for customers.

    - newCustomer(), has two parameters of type String (name of customer), double (initial transaction) and returns a boolean.
    Returns true if the customer was added successfully or false otherwise.

    - addCustomerTransaction(), has two parameters of type String (name of customer), double (transaction) and returns a boolean.
    Returns true if the customers transaction was added successfully or false otherwise.

    - findCustomer(), has one parameter of type String (name of customer) and returns a Customer.
    Return the Customer if they exist, null otherwise.

3. Customer

  - It has two fields, A String called name and an ArrayList that holds objects of type Double called transactions.
  - A constructor that takes a String (name of customer) and a double (initial transaction). It initialises name and instantiates transactions.

  - And three methods, they are (their functions are in their names):
    - getName(), getter for name.
    - getTransactions(), getter for transactions.
    - addTransaction(), has one parameter of type double (transaction) and doesn't return anything.

TIP: In Bank, use the findBranch() method in each of the other four methods to validate a branch. Do the same thing in Branch with findCustomer() - except for the two getters.
TIP: In Customer, think about what else you need to do in the constructor when you instantiate a Customer object.
TIP: Think about what methods you need to call from another class when implementing a method.
TIP: Be extremely careful with the spelling of the names of the fields, constructors and methods.
TIP: Be extremely careful about spaces and spelling in the printed output.

NOTE: All transactions are deposits (no withdraws/balances).
NOTE: All fields are private.
NOTE: All constructors are public.
NOTE: All methods are public (except for findBranch() and findCustomer() which are private).
NOTE: There are no static members.
NOTE: Do not add a main method to the solution code.
NOTE: If you get an error from the Evaluate class, it's most likely the constructor. Check if you've added a constructor or if the constructor has the right arguments.
 */
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

