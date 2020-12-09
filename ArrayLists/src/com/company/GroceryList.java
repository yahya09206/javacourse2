package com.company;

import java.util.ArrayList;

public class GroceryList {
    // Declare ArrayList and initialize it
    private ArrayList<String> groceryList = new ArrayList<>();

    // Function to add a grocery item
    public void addGroceryItem(String item){
        // Add to list
        groceryList.add(item);
    }

    // Print list
    public void printGroceryList(){
        System.out.println("You have " + groceryList.size() + " items in your grocery list");
        for (int i = 0; i < groceryList.size(); i++){
            System.out.println((i + 1) + ". " + groceryList.get(i));
        }
    }

    // Method to modify list less redundantly
    public void modifyGroceryItem(String newItem){
        int position = findItem(newItem);
        if (position >= 0){
            modifyGroceryItem(position, newItem);
        }
    }

    // Replace an item in the list
    public void modifyGroceryItem(int position, String newItem){
        groceryList.set(position, newItem);
        System.out.println("Grocery item " + (position+1) + " has been modified");
    }

    // Remove an item
    public void removeGroceryItem(int position){
        String theItem = groceryList.get(position);
        groceryList.remove(position);
    }

    // Find item returns true or false
    public int findItem(String searchItem){
//        boolean exists = groceryList.contains(searchItem);
        // Return item that's actualy in the list
        return groceryList.indexOf(searchItem);
//        int position = groceryList.indexOf(searchItem);
//        if (position >= 0){
//            return groceryList.get(position);
//        }
//        return null;
    }
}
