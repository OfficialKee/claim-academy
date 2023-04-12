import java.util.ArrayList;
import java.util.Scanner;

public class Interface {
   public static void main(String[] args) {
    
    Address myAddy = new Address(2943, "Spring Park rd", "Jacksonville", "Florida", 32207);

    // System.out.println(myAddy.getStreetName());

    Boolean running = true;

        while(running){
            welcomeUser();
            Scanner scanner = new Scanner(System.in);
            int value = scanner.nextInt();
            if(value == 0){
               running = false;
            }
            if(value == 1){

            }
            
        }


   }

   public static void welcomeUser() {
    System.out.println("\nWelcome to The PhoneBook");
    System.out.println("\nChoose an option: ");
    System.out.println(" \n------------------------");
    System.out.println(" [0] Exit Phonebook App ");
    System.out.println(" [1] Search contact ");
    System.out.println(" [2] Add contact ");
    System.out.println(" [3] Delete Contact ");
    System.out.println(" [4] Update Contact ");
    System.out.println(" ------------------------");
    
    
    
   }


}

    


// create a function that takes the person and the addess and add it to  an array of objects.
/* [
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