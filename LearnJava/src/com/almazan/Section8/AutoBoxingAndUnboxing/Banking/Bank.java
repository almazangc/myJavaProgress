package com.almazan.Section8.AutoBoxingAndUnboxing.Banking;

/**
 * Bank
 *
 * -It has two fields, A String called name and an ArrayList that holds objects of type Branch called branches.
 *
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
     * Encapsulation
     */
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
        addBranch(name);
    }

    public String getName() {
        return name;
    }

    public boolean addBranch(String branchName){
        if(findBranch(branchName) == null) {
            this.branches.add(new Branch(branchName));
            return true;
        }
        return false;
    }

    public boolean addCustomer(String branchName, String customerName, double initialTransactionValue){
        Branch branch = findBranch(branchName);
        if(branch != null)
            return branch.newCustomer(customerName, initialTransactionValue);

        return false;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double transactionValue){
        Branch branch = findBranch(branchName);
        if(branch != null) {
            return branch.addCustomerTransaction(customerName, transactionValue);
        }

        return false;
    }

    private Branch findBranch(String branchName){
        for (Branch inBranch: this.branches)
            if (inBranch.getName().equals(branchName))
                return inBranch;

        return null;
    }

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
