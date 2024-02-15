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
        //adds the actual contact to the object array called contacts
        contacts.add(contact);
        System.out.println("A new Contact was added: " + contact.getName());
    }

    // Method to remove a Contact by name
    public void removeContact(String name) {
       boolean removedName = contacts.removeIf(contact ->contact.getName().equals(name));

       if(removedName){
        System.out.println("This contact was removed: "+ name);
       } 
       else {
        System.out.println("The contact does not exist: "+ name);
       } 
    }

    // Method to list all Contacts
    public void listContacts() {
        System.out.println("This is the contact list: ");
        for (Contact contact: contacts){
            System.out.println("The contact name is: " + contact.getName() + ", E-mail: " + contact.getEmail() + ", Phone Number: " + contact.getPhoneNumber());
        }
    }
}