import java.util.ArrayList;
import java.util.List;

public class ContactManager {
    private List<Contact> contactList;

    public ContactManager() {
        contactList = new ArrayList<>();
    }

    public void addContact(Contact contact) {
        contactList.add(contact);
    }

    public void removeContact(String name) {
        Contact contactToRemove = null;
        for (Contact contact : contactList) {
            if (contact.getName().equals(name)) {
                contactToRemove = contact;
                break;
            }
        }
        if (contactToRemove != null) {
            contactList.remove(contactToRemove);
        } else {
            System.out.println("Contact not found!");
        }
    }

    public void listContacts() {
        for (Contact contact : contactList) {
            System.out.println(contact);
        }
    }
}
