import java.util.ArrayList;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

import java.util.HashMap;
import java.io.*;
import java.util.*;

public class Interface {
    public static void main(String[] args) {

        Address myAddy = new Address(2943, "Spring Park rd", "Jacksonville", "Florida", 32207);

        // System.out.println(myAddy.getStreetName());

        Boolean running = true;

        HashMap<String, String> phoneBook = new HashMap<String, String>();
        ArrayList<Person> mainPhoneBook = new ArrayList<>();

        while (running) {

            int value = welcomeUser();
            if (value == 0) {
                running = false;
            }
            if (value == 1) {
                String firstName = addFirstName();
                String lastName = addLastName();
                long phoneNumber = addNumber();

                Person contact = new Person(firstName, lastName, phoneNumber);
                String strigify = contact.toString();
                mainPhoneBook.add(contact);

            }
            if (value == 2) {
                for (Person person : mainPhoneBook) {
                    System.out.println("\n"+person.getFirstName() +" "+person.getLastName() + " "+ person.getPhoneNumber());
                
                }

            } 
        }

    }

    public static int welcomeUser() {
        System.out.println("\nWelcome to The PhoneBook");
        System.out.println("\nChoose an option: ");
        System.out.println(" \n------------------------");
        System.out.println(" [0] Exit Phonebook App ");
        System.out.println(" [1] Add contact ");
        System.out.println(" [2] Delete contact ");
        System.out.println(" [3] Search Contact ");
        System.out.println(" [4] Update Contact ");
        System.out.println(" ------------------------");

        Scanner scanner = scanner();
        return scanner.nextInt();
    }

    public static String addFirstName() {
        System.out.println("Enter users first name: ");
        Scanner scanner = scanner();
        String firstName = scanner.next();
        return firstName;

    }

    public static String addLastName() {
       
        Scanner scanner = scanner();
        System.out.println("Enter users last name: ");
        String lastName = scanner.next();
        return lastName;

    }

    public static long addNumber() {
        System.out.println("Enter users phone number: ");
        Scanner scanner = scanner();
        long phoneNumber = scanner.nextLong();
        return phoneNumber;
    }

    public static Scanner scanner() {
        return new Scanner(System.in);
    }

}

// create a function that takes the person and the addess and add it to an array
// of objects.
/*
 * [
 * {name:
 * address:},
 * {name:
 * address:},
 * {name:
 * address:},
 * {name:
 * address:},
 * ]
 * 
 * 
 */

/*
 * search by last name function
 * 
 * search by first name
 * 
 * search by full name
 * 
 * search by number
 * 
 * search by city
 * 
 * search by state
 * 
 * update by telephone number
 * 
 * delete by telephone number
 */