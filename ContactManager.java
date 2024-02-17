import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class ContactManager {
    private List<Contact> contacts;

    public ContactManager() {
        contacts = new ArrayList<>();
    }

    public void addContact(Contact contact) {
        contacts.add(contact);
        System.out.println("Added contact: " + contact.toString());
    }

    public void removeContact(String name) {
        Iterator<Contact> iterator = contacts.iterator();
        while (iterator.hasNext()) {
            Contact contact = iterator.next();
            if (contact.getName().equals(name)) {
                System.out.println("Removed contact: " + contact.toString());
                iterator.remove();
                return;
            }
        }
        System.out.println("Contact not found: " + name);
    }

    public void listContacts() {
        for (Contact contact : contacts) {
            System.out.println(contact.toString());
        }
    }
}
