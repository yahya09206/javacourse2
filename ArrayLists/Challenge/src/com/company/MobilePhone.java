package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class MobilePhone {

    private static ArrayList<Contacts> myContacts = new ArrayList<>();

    //Method to print contact list
    private static void printContacts(){
        if (myContacts.size() == 0){
            System.out.println("There are no contacts available");
        }else{
            for (int i = 0; i < myContacts.size(); i++){
                System.out.println("Name: " + myContacts.get(i).getName());
            }
        }
    }

    //Method to add contacts to phone
    public static void addContact(Contacts contacts){
        String name = contacts.getName();
        myContacts.add(contacts);
        System.out.println("You have added " + name + " to the contact list");
    }

    //Method to find contact
    public static int findContact(String name){
        int index = -1;
        for (int i = 0; i < myContacts.size(); i++){
            if (name.equalsIgnoreCase(myContacts.get(i).getName())){
                index = i;
            }
        }
        return index;
    }

    //Method to remove contact
    public static void removeContact(String name){
        int index = findContact(name);
        if (index < 0){
            System.out.println("Name does not exist in contact list");
        }else {
            myContacts.remove(index);
            System.out.println(name + " has been removed from contact list");
        }
    }

    //Method to edit contact
    public static void editContact(String name){
        Scanner scanner = new Scanner(System.in);
        int index = findContact(name);
        if (index < 0){
            System.out.println("Name does not exist in the contact list");
        }else {
            System.out.print("Enter new name(press Enter to make no changes) to the contact");
            String newName= scanner.nextLine();
            if (newName.isEmpty()){
                newName = name;
            }
            System.out.print("Enter new number(press Enter to make no changes) to the contact");
            String newPhoneNumber = scanner.nextLine();
            if (newPhoneNumber.isEmpty()){
                newPhoneNumber = myContacts.get(index).getPhoneNumber();
            }
            myContacts.set(index, new Contacts(newName, newPhoneNumber));
            System.out.println(newName + " has been edited");
        }
    }

}
