public class Program {
    public static void main(String[] args) {
        // Create a ContactManager object
        ContactManager contactManager = new ContactManager();

        // Create some Contact objects
        Contact contact1 = new Contact("John Doe", "john@example.com", "1234567890");
        Contact contact2 = new Contact("Jane Smith", "jane@example.com", "9876543210");

        // Add contacts to the ContactManager
        contactManager.addContact(contact1);
        contactManager.addContact(contact2);

        // Display all contacts
        contactManager.displayContacts();

        // Search for a contact
        String searchName = "John Doe";
        Contact foundContact = contactManager.searchContact(searchName);
        if (foundContact != null) {
            System.out.println("Contact found: " + foundContact);
        } else {
            System.out.println("Contact not found: " + searchName);
        }

        // Search for a contact that does not exist
        String nonExistentName = "Non Existent";
        Contact nonExistentContact = contactManager.searchContact(nonExistentName);
        if (nonExistentContact != null) {
            System.out.println("Contact found: " + nonExistentContact);
        } else {
            System.out.println("Contact not found: " + nonExistentName);
        }

        // Remove a contact
        String removeName = "Jane Smith";
        contactManager.removeContact(removeName);

        // Display all contacts after removal
        contactManager.displayContacts();
    }
}
