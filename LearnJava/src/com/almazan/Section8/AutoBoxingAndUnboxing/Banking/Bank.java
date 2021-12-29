package com.almazan.Section8.AutoBoxingAndUnboxing.Banking;

/**
 *  Bank Class
 * -It has two fields, A String called name and an ArrayList that holds objects of type Branch called branches.
 * -A constructor that takes a String (name of the bank). It initialises name and instantiates branches.
 *
 * - And five methods, they are (their functions are in their names):
 *   - addBranch(), has one parameter of type String (name of the branch) and returns a boolean.
 *         It returns true if the branch was added successfully or false otherwise.
 *
 *   - addCustomer(), has three parameters of type String (name of the branch), String (name of the customer), double (initial transaction) and returns a boolean.
 *         It returns true if the customer was added successfully or false otherwise.
 *
 *   - addCustomerTransaction(), has three parameters of type String (name of the branch), String (name of the customer), double (transaction) and returns a boolean.
 *         It returns true if the customers transaction was added successfully or false otherwise.
 *
 *   - findBranch(), has one parameter of type String (name of the Branch) and returns a Branch.
 *         Return the Branch if it exists or null otherwise.
 *
 *   - listCustomers(), has two parameters of type String (name of the Branch), boolean (print transactions) and returns a boolean.
 *         Return true if the branch exists or false otherwise. This method prints out a list of customers.
 */
import java.util.ArrayList;
public class Bank {

    /**
     * Encapsulation of fields
     */
    private String name;
    private ArrayList<Branch> branches;

    /**
     * Constructor initialise name and instantiate branches
     * @param name of the bank
     */
    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
        addBranch(name);
    }

    /**
     * Getter for branch name
     * @return branch name
     */
    public String getName() {
        return name;
    }

    /**
     * Adds new Branch to the arraylist of bank branches
     * @param branchName assigned to new branch name
     * @return if true add new branch with branch name, otherwise false means (already exist)
     */
    public boolean addBranch(String branchName){
        if(findBranch(branchName) == null) {
            this.branches.add(new Branch(branchName));
            return true;
        }
        return false;
    }

    /**
     * Adds new costumer to selected bank branch name
     * @param branchName use to locate the branch in branches list
     * @param customerName assigned as new customer name
     * @param initialTransactionValue initial amount added to new account of new customer
     * @return true if successfully added new customer, otherwise false if branch name does not exist or customer already registered to same branch
     */
    public boolean addCustomer(String branchName, String customerName, double initialTransactionValue){
        Branch branch = findBranch(branchName);
        if(branch != null)
            return branch.newCustomer(customerName, initialTransactionValue);

        return false;
    }

    /**
     * Adds new customer transaction
     * @param branchName use to locate if the branch exist in list
     * @param customerName use to locate if the customer exits in current branch
     * @param transactionValue use to add new transaction amount
     * @return true if new customer transaction successful otherwise false branch does not exist or customer is not registered to bank
     */
    public boolean addCustomerTransaction(String branchName, String customerName, double transactionValue){
        Branch branch = findBranch(branchName);
        if(branch != null) {
            return branch.addCustomerTransaction(customerName, transactionValue);
        }

        return false;
    }

    /**
     * Data Validation and search branch
     * @param branchName search parameter of branch name
     * @return return matching branch else it returns null
     */
    private Branch findBranch(String branchName){
        for (Branch inBranch: this.branches)
            if (inBranch.getName().equals(branchName))
                return inBranch;

        return null;
    }

    /**
     * Display the Branch name, Customer list and all transactions
     * @param branchName validation and use to locate if branchName exist
     * @param showTransaction if true display all transactions made by customer otherwise not
     * @return true if branch name exist otherwise not
     */
    public boolean listCustomers(String branchName, boolean showTransaction){

        Branch branch = findBranch(branchName);

        if (branch != null){
            System.out.println("Customer details for branch " + branch.getName());
            int i = 1; int j = 1;
            for(Customer branchCustomer: branch.getCustomers()){
                System.out.println("Customer: " + branchCustomer.getName() + "[" + i + "]");
                if(showTransaction) {
                    System.out.println("Transactions");
                    for (Double transactions: branchCustomer.getTransactions()) {
                        System.out.println("[" + (j) + "]  Amount " + transactions);
                        j++;
                    }
                }
                i++;
            }
            return true;
        }

        return false;
    }
}
