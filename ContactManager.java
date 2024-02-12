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
        // setup a contact that needs to be removed(currently null)
        Contact contactToRemove = null;
        
        // search for the contact through the array list, and break the loop if found
        for (Contact contact : contacts) {
            if (contact.getName().equals(name)) {
                contactToRemove = contact;
                break;
            }
        }

        // remove the contact if found, if not return a message to indicate that it wasn't found
        if (contactToRemove != null) {
            contacts.remove(contactToRemove);
            System.out.println("Contact " + name + " was removed successfully!");
        } else {
            System.out.println("Contact " + name + " was not found.");
        }
    }

    // Method to list all Contacts
    public void listContacts() {
        // print out the contacts in order to list them off to the user
        for (Contact contact : contacts) {
            System.out.println(contact);
        }
    }
}
