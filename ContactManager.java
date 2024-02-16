import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

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
        //add the new contact to the contact list
        contacts.add(contact);
        //Print message 
        System.out.println("Contact added successfully: " + contact.getName());
    }

    // Method to remove a Contact by name
    public void removeContact(String name) {
        Iterator<Contact> iterator = contacts.iterator();
        //Iterate to the contact list
    while (iterator.hasNext()) {
        //get the next contact
        Contact contact = iterator.next();
        //check to see if the contact matches
        if (contact.getName().equals(name)) {
            //remove the contact
            iterator.remove();
            //print message
            System.out.println("Contact removed: " + contact);
        }
    }
    }

    // Method to list all Contacts
    public void listContacts() {
        //print the list of contacts
        System.out.println("List of Contacts:");
        //Iterate the contact list
        for (Contact contact : contacts) {
            //Print the contacts
            System.out.println(contact);
        }
    }

}