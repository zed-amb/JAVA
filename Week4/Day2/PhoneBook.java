package Week4.Day2;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class PhoneBook {
        public static void main(String[] args) {

            /**
             * Create a simple phonebook using a map to store names and phone numbers. Allow the user to add,
             * search for, and remove entries
             */
            Map<String, String> phonebook = new HashMap<>();
            Scanner scanner = new Scanner(System.in);

            while (true) {
                System.out.println("Phonebook Menu:");
                System.out.println("1. Add Entry");
                System.out.println("2. Search Entry");
                System.out.println("3. Remove Entry");
                System.out.println("4. Exit");
                System.out.print("Enter your choice: ");

                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        System.out.print("Enter name: ");
                        String name = scanner.nextLine();
                        System.out.print("Enter phone number: ");
                        String phoneNumber = scanner.nextLine();
                        phonebook.put(name, phoneNumber);
                        System.out.println("Entry added!");
                        break;

                    case 2:
                        System.out.print("Enter name to search: ");
                        String searchName = scanner.nextLine();
                        String result = phonebook.getOrDefault(searchName, "Entry not found");
                        System.out.println("Search result: " + result);
                        break;

                    case 3:
                        System.out.print("Enter name to remove: ");
                        String removeName = scanner.nextLine();
                        String removedEntry = phonebook.remove(removeName);
                        if (removedEntry != null) {
                            System.out.println("Entry removed!");
                        } else {
                            System.out.println("Entry not found.");
                        }
                        break;

                    case 4:
                        System.out.println("Exiting phonebook...");
                        scanner.close();
                        System.exit(0);
                        break;

                    default:
                        System.out.println("Invalid choice. Please enter a valid option.");
                }
            }
        }
}
