import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
// ContactManager class
class ContactManager {
    // Contact List
    private List<Contact> contacts;

    // ContactManager Constructor
    public ContactManager() {
        contacts = new ArrayList<>();
    }

    // New Contact Method
    public void addContact(Contact contact) {
        contacts.add(contact);
        System.out.println("Contact added: " + contact.getName());
    }

    // Remove Contact Method 
    public void removeContact(String name) {
        Iterator<Contact> iterator = contacts.iterator();
        while (iterator.hasNext()) {
            Contact contact = iterator.next();
            if (contact.getName().equals(name)) {
                iterator.remove();
                System.out.println("Contact removed: " + name);
                return;
            }
        }
        System.out.println("Contact not found: " + name);
    }

    // All contacts List
    public void listContacts() {
        if (contacts.isEmpty()) {
            System.out.println("No contacts available.");
        } else {
            System.out.println("List of contacts:");
            for (Contact contact : contacts) {
                System.out.println(contact);
            }
        }
    }

    // Show the contact method
    public List<Contact> getContacts() {
        return contacts;
    }
}