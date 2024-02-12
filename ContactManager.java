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
        System.out.println("\nNew Contact added: " + contact.toString());
    }

    // Method to remove a Contact by name
    public void removeContact(String name) {
        
        for(Contact contact : contacts)
        {
            if(contact.getName().equals(name))
            {
                contacts.remove(contact);
                System.out.println("\nContact Removed: " + contact.toString());
            }
            else
                System.out.println("Contact " + name + " not found.");
        }
    }

    // Method to list all Contacts
    public void listContacts() {
        if(contacts.isEmpty())
        {
            System.out.println("There are no contacts.");
        }
        else
        {
            System.out.println("\nList of Contacts: ");
            for(Contact contact : contacts)
            {
                System.out.println(contact.toString());
            }

        }
    }


}