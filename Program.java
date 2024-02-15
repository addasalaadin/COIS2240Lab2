public class Program {
        // Main method for testinbg
        public static void main(String[] args) {
            // Create a ContactManager object
            ContactManager manager = new ContactManager();
    
            // Add contacts
           // manager.addContact(new Contact("William", "william@trentu.ca", "123-456-3333"));
            manager.addContact(new Contact("James", "James@example.com", "098-765-4444"));
            manager.addContact(new Contact("Mark", "Mark@trentu.ca", "123-456-7777"));
            manager.addContact(new Contact("George", "George@example.com", "098-765-9999"));
    
            // List contacts
            manager.listContacts();
    
            // Remove a contact
            manager.removeContact("William");
    
            // List contacts again to see the change
            manager.listContacts();
        }
}
