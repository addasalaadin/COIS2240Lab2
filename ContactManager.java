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
        for (Contact existingContact : contacts) {
            if (existingContact.getName().equals(contact.getName())) {
                System.out.println("Contact with the same name already exists: " + contact.getName());
                return;}
            }

            contacts.add(contact);
        System.out.println("Contact added: " + contact);

    }

    // Method to remove a Contact by name
    public void removeContact(String name) {
        boolean removed = false;
        for (Contact contact : contacts) {
            if (contact.getName().equals(name)) {
                contacts.remove(contact);
                System.out.println("Contact removed: " + name);
                removed = true;
                break;
            }
        }
        if (!removed) {
            System.out.println("Contact not found: " + name);
        }
    }

    // Method to list all Contacts
    public void listContacts() {
        if (contacts.isEmpty()) {
            System.out.println("No contacts available");
            return;
        }
        System.out.println("List of contacts:");
        for (Contact contact : contacts) {
            System.out.println(contact);
    }
}}