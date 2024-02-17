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
     
        Boolean ifExists = false;

        for (Contact contact : contacts) {
            if (contact.getName() == name){
                ifExists = true;
                contacts.remove(contact);
            }
        }    
        if (ifExists == false){
            System.out.println("Contact does not exist.");
        }    
    }

    // Method to list all Contacts
    public void listContacts() {
      
        for (Contact contact : contacts) {
            System.out.println(contact.toString());
        }
    }


}