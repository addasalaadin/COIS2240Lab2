public class Program {
        // Main method for testing
        public static void main(String[] args) {
            // Create a ContactManager object
            ContactManager manager = new ContactManager();
    
            // Add contacts
            manager.addContact(new Contact("Alaadin", "alaadin@trentu.ca", "123-456-7890"));
            manager.addContact(new Contact("Bob", "bob@example.com", "098-765-4321"));
            manager.addContact(new Contact("Mariam", "mariammerza@trentu.ca", "555-555-5555"));
    
            // List contacts
            manager.listContacts();
    
            // Remove a contact
              manager.removeContact("Alaadin");
                System.out.println("Removed contact: Alaadin");

            manager.removeContact("Bob");
                System.out.println("Removed contact: Bob");

            manager.removeContact("Jane");
        }
    }