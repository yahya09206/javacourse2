package com.company;

import java.util.ArrayList;

public class MobilePhone {

    private String myNumber;
    private ArrayList<Contacts> contacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.contacts = new ArrayList<Contacts>();
    }

    // Method to add contacts
    public boolean addContact(Contacts contact){
        if (findContact(contact.getName()) >= 0){
            System.out.println("Contact is already on file");
            return false;
        }

        contacts.add(contact);
        return true;
    }

    public boolean updateContact(Contacts oldContact, Contacts newContact){
        int foundPosition = findContact(oldContact);
        if (foundPosition < 0){
            System.out.println(oldContact.getName() + ", was not found");
            return false;
        }
        this.contacts.set(foundPosition, newContact);
        System.out.println(oldContact.getName() + ", was replaced with " + newContact.getName());
        return true;
    }


    // Method to find contact name
    private int findContact(Contacts searchName){
        return this.contacts.indexOf(searchName);
    }

    private int findContact(String contactName){
        for (int i = 0; i < this.contacts.size(); i++){
            Contacts contact = this.contacts.get(i);
            if (contact.getName().equals(contactName)) {
                return i;
            }
        }
        return -1;
    }

    // Query contact list
    public String queryContact(Contacts contacts){
        if (findContact() > 0){
            return contacts.getName();
        }
        return null;
    }
}
