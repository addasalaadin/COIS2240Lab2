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
        if (contacts.contains(contact)){
            System.out.println(contact.toString() + " already exists in contacts");
        }
        else{
            contacts.add(contact);
            System.out.println(contact.getName() + " has been added to contacts");
        }
        
    }

    // Method to remove a Contact by name
    public void removeContact(String name) {
        for(Contact contact: contacts){
            if (contact.getName() == name){
                contacts.remove(contact);
                System.out.println(name + " has been removed from contacts");
                return;
            }
        }
        System.out.println(name + " is not in contacts");
    }

    // Method to list all Contacts
    public void listContacts() {
        System.out.println("\n");
        for(Contact contact: contacts){
            System.out.println(contact.toString());
        }
        System.out.println("\n");
    }


}