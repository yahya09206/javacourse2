package com.company;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
	// write your code here
        boolean quit = false;
        int choice;
        showMenuChoices();

        while (!quit){
            System.out.println("What would you like to do?");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 1:
                    showMenuChoices();
                    break;
                case 2:
                    MobilePhone.printContactList();
                    break;
                case 3:
                    findContact();
                    break;
                case 4:
                    addContact();
                    break;
                case 5:
                    removeContact();
                    break;
                case 6:
                    editContact();
                    break;
                case 7:
                    System.out.println("Quitting....");
                    quit = true;
                    break;
            }
        }

    }

    public static void showMenuChoices(){
        System.out.println("Enter your choice from the menu: ");
        System.out.println("(1) to bring up the menu choices");
        System.out.println("(2) to see the list of existing contacts");
        System.out.println("(3) to find an existing contact");
        System.out.println("(4) to add a new contact");
        System.out.println("(5) to remove an existing contact");
        System.out.println("(6) to edit an existing contact");
        System.out.println("(7) to quit");
    }

    public static void addContact(){
        System.out.println("Enter name: ");
        String name = scanner.nextLine();
        System.out.println("Enter phone number: ");
        String phoneNumber = scanner.nextLine();
        Contacts contacts = new Contacts(name, phoneNumber);
        MobilePhone.addContact(contacts);
    }

    public static void findContact(){
        System.out.println("Enter name to look for: ");
        String name = scanner.nextLine();
        MobilePhone.findContact(name);

    }

    public static void removeContact(){
        System.out.println("Enter name to remove: ");
        String name = scanner.nextLine();
        MobilePhone.removeContact(name);
    }

    public static void editContact(){
        System.out.println("Enter name to edit: ");
        String name = scanner.nextLine();
        MobilePhone.editContact(name);
    }
}
