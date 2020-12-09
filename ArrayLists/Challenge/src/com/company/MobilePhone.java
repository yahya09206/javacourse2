package com.company;

import java.util.ArrayList;

public class MobilePhone {

    private ArrayList<Contacts> contacts = new ArrayList<Contacts>();

    // Method to add contacts
    public void addContact(Contacts contact){
        String name = contact.getName();
        contacts.add(contact);
        System.out.println("Successfully added " + name);
    }

    public ArrayList<Contacts> getContactsList(){
        return contacts;
    }

    public void printContactList(){
        System.out.println("You have " + contacts.size() + " contacts in your mobile phone");
        for (int i = 0; i < contacts.size(); i++){
            System.out.println((i + 1) + ". " + contacts.get(i));
        }
    }

    private void modifyContacts(int position, Contacts newContact){
        contacts.set(position, newContact);
        System.out.println("Contact " + (position + 1) + " has been modified");
    }

    public void removeContact(Contacts name){
        int position = findItem(name){
            if(position >= 0){
                modifyContacts(position, name);
            }
        }
    }
}
