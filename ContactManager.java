import java.util.*;


// Define the ContactManager class
class ContactManager {
    private List<Contact> contacts;

    public ContactManager() {
        this.contacts = new ArrayList<>();
    }

    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    public void removeContact(String name) {
        contacts.removeIf(contact -> contact.getName().equals(name));
    }

    public void listContacts() {
        System.out.println("Contacts:");
        for (Contact contact : contacts) {
            System.out.println("Name: " + contact.getName() + ", Email: " + contact.getEmail() + ", Phone: " + contact.getPhoneNumber());
        }
        System.out.println();
    }
}

