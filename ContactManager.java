import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Define the ContactManager class
public class ContactManager {
    // List to store contacts
    private List<Contact> contacts;

    // Constructor to initialize the contact list
    public ContactManager() {
        contacts = new ArrayList<>();
    }

    // Method to add a contact
    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    // Method to remove a contact by name
    public void removeContact(String name) {
        Iterator<Contact> iterator = contacts.iterator();
        while (iterator.hasNext()) {
            Contact contact = iterator.next();
            if (contact.getName().equals(name)) {
                iterator.remove();
                System.out.println("Contact removed: " + contact);
            }
        }
    }

    // Method to search for a contact by name
    public Contact searchContact(String name) {
        for (Contact contact : contacts) {
            if (contact.getName().equals(name)) {
                return contact;
            }
        }
        return null; // Contact not found
    }

    // Method to display all contacts
    public void displayContacts() {
        System.out.println("All Contacts:");
        for (Contact contact : contacts) {
            System.out.println(contact);
        }
    }
}
