/* 
 * Name: Julian Campo
 * Student #: 0824564
 * Date: 2024-02-16
 * 
*/
import java.util.Scanner;

public class Program {
    // Main method for testing the code
    public static void main(String[] args) {
        ContactManager manager = new ContactManager();

        // The contacts added by default
        manager.addContact(new Contact("Alaadin", "alaadin@trentu.ca", "123-456-7890"));
        manager.addContact(new Contact("Bob", "bob@example.com", "098-765-4321"));

        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("\nJulian's Contact Menu:");
            System.out.println("1. Display all contacts");
            System.out.println("2. Search a contact by name");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    // Calling list of contacts
                    manager.listContacts();
                    break;
                case 2:
                    // Search by Name 
                    System.out.print("Enter the name to search: ");
                    String name = scanner.nextLine();
                    searchContact(manager, name);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        } while (choice != 0);

        scanner.close();
    }

    // Method to search contact
    private static void searchContact(ContactManager manager, String name) {
        System.out.println("\nSearching for contact: " + name);
        boolean found = false;
        for (Contact contact : manager.getContacts()) {
            if (contact.getName().equalsIgnoreCase(name)) {
                System.out.println("Contact found:");
                System.out.println(contact);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Contact not found.");
        }
    }
}
