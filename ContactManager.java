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
        contacts.add(0, contact);
        contacts.add(1, contact);
        contacts.add(2, contact);
        System.out.println(contact + "has been added successfully");
    }

    // Method to remove a Contact by name
    public Boolean removeContact(String name) {
        // Your code here
        Iterator<Contact> iterator = contacts.iterator();
        while (iterator.hasNext()) {
            Contact contact = iterator.next();
            if (contact.getName().equalsIgnoreCase(name)) {
                iterator.remove();
                System.out.println("The contact has been successfully removed");
                break;
            } else {
                System.out.println("Contact not found.");
                break;
            }
        }
        return true;
    }

    // Method to list all Contacts
    public void listContacts() {
        // Your code here
        for (Contact contact : contacts) {
            System.out.println(contact);
        }

    }
}