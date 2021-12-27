package com.almazan.Section8.InbuiltList;

import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<String>();

    /**
     * Appends the specified item to the end of this list.
     * @param item element to be appended to this list
     */
    public void addGroceryItem(String item) {
        groceryList.add(item);
    }

    /**
     * Display List of grocery items.
     */
    public void printGroceryList() {
        System.out.println("You have " + groceryList.size() + " items in your grocery list");
        for(int i=0; i< groceryList.size(); i++) {
            System.out.println((i+1) + ". " + groceryList.get(i));
        }
    }

    /**
     * Modify list items
     * @param position of newItem name
     * @param newItem name of the modified list
     */
    public void modifyGroceryItem(int position, String newItem) {
        groceryList.set(position, newItem);
        System.out.println("Grocery item " + (position+1) + " has been modified.");
    }

    /**
     * Remove a item from grocery list
     * @param position index of list
     */
    public void removeGroceryItem(int position) {
        String theItem = groceryList.get(position);
        groceryList.remove(position);
    }
}
