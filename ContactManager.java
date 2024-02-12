import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ContactManager {
    private List<Contact> contacts;

    public ContactManager() {
        contacts = new ArrayList<>();
    }

    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    public void removeContact(String name) {
        Iterator<Contact> iterator = contacts.iterator();
        while (iterator.hasNext()) {
            Contact contact = iterator.next();
            if (contact.getName().equals(name)) {
                iterator.remove();
            }
        }
    }

    public void listContacts() {
        for (Contact contact : contacts) {
            System.out.println(contact);
        }
    }
}
