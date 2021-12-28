package com.almazan.Section8.AutoBoxingAndUnboxing.Banking;

import java.util.ArrayList;

/**
 * Branch
 *
 *   - It has two fields, A String called name and an ArrayList that holds objects of type Customer called customers.
 *
 *   - A constructor that takes a String (name of the branch). It initialises name and instantiates customers.
 *
 *   - And five methods, they are (their functions are in their names):
 *
 *     - getName(), getter for name.
 *
 *     - getCustomers(), getter for customers.
 *
 *     - newCustomer(), has two parameters of type String (name of customer), double (initial transaction) and returns a boolean.
 *     Returns true if the customer was added successfully or false otherwise.
 *
 *     - addCustomerTransaction(), has two parameters of type String (name of customer), double (transaction) and returns a boolean.
 *     Returns true if the customers transaction was added successfully or false otherwise.
 *
 *     - findCustomer(), has one parameter of type String (name of customer) and returns a Customer.
 *     Return the Customer if they exist, null otherwise.
 */
public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean newCustomer(String name, double initialAmountValue){
        if(findCustomer(name) == null) {
            this.customers.add(new Customer(name, initialAmountValue));
            return true;
        }

        return false;
    }

    public boolean addCustomerTransaction(String name, double transactionValue){
        Customer existingCustomer = findCustomer(name);
        if (this.customers.contains(existingCustomer)) { // this.customers != null
            existingCustomer.addTransaction(transactionValue);
            return true;
        }
            return false;
    }

    private Customer findCustomer(String name){
        for (Customer inCustomer: this.customers)
            if(inCustomer.getName().equals(name))
                return inCustomer;

        return null;
    }
}
