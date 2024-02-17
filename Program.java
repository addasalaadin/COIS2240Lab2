public class Program {
    public static void main(String[] args) {
        ContactManager manager = new ContactManager();

        // Add contacts
        manager.addContact(new Contact("Aladdin", "aladdin@example.com", "123-456-7890"));
        manager.addContact(new Contact("Bob", "bob@example.com", "098-765-4321"));

        // List contacts
        System.out.println("Listing all contacts:");
        manager.listContacts();

        // Remove a contact and show attempt to remove non-existing contact
        System.out.println("\nRemoving Aladdin and attempting to remove non-existing contact:");
        manager.removeContact("Aladdin");
        manager.removeContact("Charlie"); // This contact does not exist

        // List contacts again to see the change
        System.out.println("\nListing all contacts after removal:");
        manager.listContacts();
        
        // Add another contact and list again
        manager.addContact(new Contact("Charlie", "charlie@example.com", "321-654-0987"));
        System.out.println("\nListing all contacts after adding Charlie:");
        manager.listContacts();
    }
}
