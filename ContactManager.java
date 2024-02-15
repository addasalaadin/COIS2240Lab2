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
    public void addContact(Contact contact) 
    {
        contacts.add(contact);
    }

    // Method to remove a Contact by name
    public void removeContact(String name) 
    {
        Iterator<Contact> deletecontact = contacts.iterator();
        while (deletecontact.hasNext()) 
        {
            Contact contact = deletecontact.next();
            if (contact.getName().equals(name)) 
            {
                deletecontact.remove();
                System.out.println("Contact deleted: " + contact.getName());
            } 
            else if (!contact.getName().equals(name))
            {
                System.out.println("Couldnt find contact");
            }
        }
    }
        
    // Method to list all Contacts
    public void listContacts() 
    {
        System.out.println("List of contacts:");
    for (Contact contact : contacts) 
    {
        System.out.println(contact);
        
    }
     }


}