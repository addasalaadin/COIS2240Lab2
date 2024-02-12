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
        // goes through list
        for(int i = 0; i < contacts.size(); i++){
            // if the object in the list has the same name
            if((contacts.get(i).getName()).equals(name)){
                // remove the object
                contacts.remove(i);
            }

        }
    }

    // Method to list all Contacts
    public void listContacts() {
        // goes through every contact
        for(int i = 0; i < contacts.size(); i++){
            // uses toString method for every object to print
            System.out.println(contacts.get(i)); 
        }
    }


}