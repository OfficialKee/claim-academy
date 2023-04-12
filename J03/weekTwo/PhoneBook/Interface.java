import java.util.ArrayList;
import java.util.Scanner;
public class Interface {
    public static void main(String[] args) {

        Boolean running = true;
        
        ArrayList<Person> mainPhoneBook = new ArrayList<>();
        

        while (running) {

            int value = welcomeUser();
            if (value == 0) {
                running = false;
            }
            if (value == 1) {
                String firstName = addFirstName();
                String lastName = addLastName();
                Address address = addAddress();
                long phoneNumber = addNumber();
                Person contact = new Person(firstName, lastName, address, phoneNumber);
                mainPhoneBook.add(contact);
                    
            }
            if (value == 2 ) {
                for (Person person : mainPhoneBook) {
                    System.out.println("\n"+person.getFirstName() +" "+person.getLastName() + " "+ person.getPhoneNumber()+ " "+person.getAddress());
                
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
        System.out.println(" [2] Show Phonebook ");
        System.out.println(" [3] Delete Contact ");
        System.out.println(" [4] Search Contact ");
        System.out.println(" [5] Update Contact ");
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

    public static  Address addAddress() {
        Scanner scanner = scanner();
        System.out.println("Enter home or apartment number");
        int home = scanner.nextInt();
        System.out.println("Enter street name: ");
        scanner.nextLine();
        String street = scanner.nextLine();
        System.out.println("Enter city: ");
        String city = scanner.next();
        System.out.println("Enter state: ");
        String state = scanner.next();
        System.out.println("Enter zip code: ");
        int zipCode = scanner.nextInt();

      Address theAddy = new Address(home, street, city, state, zipCode);

        return theAddy;

        
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