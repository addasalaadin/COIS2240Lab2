import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Define the ContactManager class
class ContactManager {
    // List to store Contact objects
    public List<Contact> contacts;

    // Constructor to initialize the ContactManager
    public ContactManager() {
        this.contacts = new ArrayList<>();
    }

    // Method to add a new Contact
    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    public void removeContact(String name) {
        boolean status = false; // Temporary boolean to track if an applicable name was found
        Iterator<Contact> iterator = contacts.iterator(); // Use iterator for safe removal during iteration

        while (iterator.hasNext()) {
            Contact contact = iterator.next(); // Access the current Contact object

            if (name.equals(contact.getName())) { // Compares names
                iterator.remove(); // Removes the contact from the list safely
                System.out.println("The contact has been removed from the list.");
                status = true; // Indicate that a matching name was found and removed
                break; // Exit the loop as the contact has been found and removed
            }
        }

        if (!status) {
            System.out.println("No contact with the provided name was found.");
        }
    }

    // Method to list all Contacts
    public void listContacts() {
        for (int i = 0; i < contacts.size(); i++) {
			// prints all books
			System.out.println(contacts.get(i));
		}
    }


}