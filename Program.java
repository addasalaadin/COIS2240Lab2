public class Program {
    // Main method for testinbg
    public static void main(String[] args) {
        // Create a ContactManager object
        ContactManager manager = new ContactManager();

        // Add contacts
        manager.addContact(new Contact("Alaadin", "alaadin@trentu.ca", "123-456-7890"));
        manager.addContact(new Contact("Bob", "bob@example.com", "098-765-4321"));

        // List contacts
        manager.listContacts();

        // Remove a contact
        manager.removeContact("Alaadin");

        // Printing List contacts again to see the change
        System.out.println("Contacts after removal");
        manager.listContacts();

        // Removing a contact that doesn't exist 
        manager.removeContact("Anmol");

        // Printing List contacts once again to see if there is any change
        System.out.println("Contacts after the removal of fake contact");
        manager.listContacts( );

    }
}
