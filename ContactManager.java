import java.util.ArrayList;
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
        contacts.add(contact);
        System.out.println("Contact added: " + contact.getName());
    }

    // Method to remove a Contact by name
    public void removeContact(String name) {
        boolean removed = contacts.removeIf(contact -> contact.getName().equals(name));
        if (removed) {
            System.out.println("Contact removed: " + name);
        } else {
            System.out.println("Contact with name " + name + " not found.");
        }
    }

    // Method to list all Contacts
    public void listContacts() {
        System.out.println("List of Contacts:");
        for (Contact contact : contacts) {
            System.out.println(contact);
        }
    }
}
