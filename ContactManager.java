import java.util.ArrayList;
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
        for (Contact contact : contacts)
        {
            if (contact.getName().equalsIgnoreCase(name))
            {
                contacts.remove(contact);
            }
        }
    }

    // Method to list all Contacts
    public void listContacts() {
         for (Contact contact : contacts)
         {
            System.out.println(contact.getName() + " " + contact.getEmail()  + " " + contact.getPhoneNumber());
         }
    }


}