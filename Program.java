/**
 * Name: Nirmal Patel
 * Date: 16 Feb 2024
 */

public class Program {
    // Main method for testinbg
    public static void main(String[] args) {
        // Create a ContactManager object
        ContactManager manager = new ContactManager();

        // Add contacts
        manager.addContact(new Contact("Alaadin", "alaadin@trentu.ca", "123-456-7890"));
        manager.addContact(new Contact("Bob", "bob@example.com", "098-765-4321"));
        manager.addContact(new Contact("Nirmal", "nirpatel@trentu.ca", "975-310-8642"));
        manager.addContact(new Contact("Zombie", "zombie@trentu.ca", "111-222-3333"));

        // List contacts
        manager.listContacts();
        System.out.println();
        // Remove a contact by Name
        manager.removeContact("Alaadin");
        // removing a contact by email
        manager.removeContact("Tod");
        manager.removeContactByEmail("nirpatel@trentu.ca");

        // List contacts again to see the change
        manager.listContacts();
        System.out.println();
    }
}
