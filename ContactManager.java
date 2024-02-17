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
        contacts.add(contact);;
    }

    // Method to remove a Contact by name
    public void removeContact(String Name) {
        Iterator<Contact> it = contacts.iterator();
        while (it.hasNext()) {
            Contact contact = it.next();
            if (contact.getName() == Name) {
                it.remove();
                System.out.println("\"" + Name + "\" is removed");
                break;
            }
            else if(contact.getName() != Name){
                System.out.println("Err: \"" + Name + "\" DOES NOT EXIST");
                break;
            }
        }
    }
    // Method to remove a Contact by name
    public void removeContactByEmail(String Email) {
        Iterator<Contact> it = contacts.iterator();
        while (it.hasNext()) {
            Contact contact = it.next();
            if (contact.getEmail() == Email) {
                it.remove();
                System.out.println("\"" + Email + "\" is removed");
            }
            else if(contact.getEmail() != Email){
                System.out.println("Err: \"" + Email + "\" DOES NOT EXIST");
                break;
            }
        }
    }

    // Method to list all Contacts
    public void listContacts() {
        System.out.println("\nList of Contacts: \n");
        for (Contact contact : contacts){
            System.out.print(contact.getName() + " | ");
            System.out.print(contact.getEmail() + " | ");
            System.out.print(contact.getPhoneNumber() + "\n");
        }
    }


}