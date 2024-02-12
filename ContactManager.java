import java.util.ArrayList;
import java.util.Collections;
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
    public Boolean addContact(Contact contact) {
        // Your code here
        for (Contact c : contacts) {
            if (c.getName().equals(contact.getName())) {
                //if a contact with the same name already exists don't add it
                return false;
            }
        }
        contacts.add(contact);
        return true;

    }

    // Method to remove a Contact by name
    public boolean removeContact(String name) {
        // Your code here
        for (Iterator<Contact> iterator = contacts.iterator(); iterator.hasNext();){
            Contact contact = iterator.next();
            if (contact.getName().equals(name)) {
                iterator.remove();
                return true;   // Return true if the contact was removed
            }
        }
        return false; // Return false if no contact to remove was found
    }

    //Method to list all Contacts
    public void listContacts() {
        // Your code here
        if (contacts.isEmpty()) {
            System.out.println("No contacts found.");
        } else {
            for (Contact contact : contacts) {
                System.out.println("Name: " + contact.getName() + ", Email: " + contact.getEmail() + ", Phone: " + contact.getPhoneNumber());
            }
        }
    }

    //Method to get an unmodifiable view of the contact list
    public List<Contact> getContacts() {
        return Collections.unmodifiableList(contacts);
    }


}