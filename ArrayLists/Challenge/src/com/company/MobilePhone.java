package com.company;

import java.util.ArrayList;

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

}
