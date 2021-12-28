package com.almazan.Section8.InbuiltList.GroceryShopping;

import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<String>();

    public ArrayList<String> getGroceryList() {
        return groceryList;
    }

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
    private void modifyGroceryItem(int position, String newItem) {
        groceryList.set(position, newItem);
        System.out.println("Grocery item " + (position+1) + " has been modified.");
    }

    /**
     * Overloaded method that search an item with by it name
     * @param currentItem an item from grocery list
     * @param newItem new name set on item being changed if found
     */
    public void modifyGroceryItem(String currentItem, String newItem) {
        int position = findItem(currentItem);
        if(position > -1)  //Checks if return position is not -1;
            modifyGroceryItem(position, newItem);
    }


    /**
     * Remove a item from grocery list
     * @param position index of list
     */
    private void removeGroceryItem(int position) {
        groceryList.remove(position);
    }

    /**
     * Overloaded method of removeGroceryItem that take item name as param
     * @param item name of an item being removed
     */
    public void removeGroceryItem(String item) {
        int position = findItem(item);
        if(position > -1)
            removeGroceryItem(position);
    }

    /**
     * Search and Return matching item from the grocery list
     * @param searchItem keyword being search at grocery list
     * @return the index of the first occurrence of the searchItem element
     */
    private int findItem(String searchItem) {
        return groceryList.indexOf(searchItem);
        //boolean exists = groceryList.contains(searchItem);
    }

    /**
     * Check if Search item is in the list or not
     * @param searchItem name of item being searched
     * @return a boolean value
     */
    public boolean onFile(String searchItem) {
        return (findItem(searchItem) > -1);
    }
}
