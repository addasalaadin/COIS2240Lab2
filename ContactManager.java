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
        
        //Iterate through contacts
        for (Contact i : contacts)
        {
            if ((Contact.getName(i)).equals(name)) //If the name given matches a contact
            {
                contacts.remove(i); //Remove that contact
            }
        }
    }

    // Method to list all Contacts
    public void listContacts() {
        
        //Print all contacts
        System.out.println(contacts);
    }


}