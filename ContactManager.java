import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Define the ContactManager class
class ContactManager {
    // List to store Contact objects
    private List<Contact> contacts;

    // Constructor to initialize the ContactManager
    public ContactManager() {
        contacts = new ArrayList<>();
    }

    // Method to add a new Contact
    public void addContact(Contact contact) {
        // Your code here
        contacts.add(contact);
        System.out.println("Contact added: " + contact.getName());
    }

    // Method to remove a Contact by name
    public void removeContact(String name) {
        // Your code here
        for (Contact contact : contacts) {
            if (contact.getName().equals(name)) {
                contacts.remove(contact);
                System.out.println("Contact removed: " + name);
                return; // Exit the loop once the contact is removed
            }
        }
        System.out.println("Contact not found: " + name);
    }

    // Method to list all Contacts
    public void listContacts() {
        // Your code here
        System.out.println("List of Contacts:");

        for (Contact contact : contacts) {
            System.out.println(contact.getName() + ": " + contact.getPhoneNumber() + " , " + contact.getEmail());
        }
    }


}