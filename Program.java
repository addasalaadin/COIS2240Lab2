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
    
            // List contacts again to observe the change
            manager.listContacts();

            // Remove a contact that does not exist
            manager.removeContact("Alejandra");
    
            // List contacts again to see nothing has changed
            manager.listContacts();

            //Add the removed contact back in, and print updated list
            manager.addContact(new Contact("Alaadin", "alaadin@trentu.ca", "123-456-7890"));
            manager.listContacts();
        }
}
