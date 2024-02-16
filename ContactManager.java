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
        contacts.add(contact);
    }

    // Method to remove a Contact by name
    public void removeContact(String name) {
        // Use Iterator over to find the contact in the list
        Iterator<Contact> Cont = contacts.iterator();
        while (Cont.hasNext()) {
            Contact contact = Cont.next();
            if (contact.getName().equals(name)) {
                Cont.remove(); // Remove contact
                break; 
            }
        }
    }

    // Method to list all Contacts
    public void listContacts() {
        System.out.println("Contacts List:");
        for (Contact contact : contacts) {
            System.out.println(contact); 
        }
    }


}