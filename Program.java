public class Program {
        // Main method for testinbg
        public static void main(String[] args) {
            System.out.println("\n");
            // Create a ContactManager object
            ContactManager manager = new ContactManager();
            
            // Add contacts
            manager.addContact(new Contact("Alaadin", "alaadin@trentu.ca", "123-456-7890"));
            manager.addContact(new Contact("Bob", "bob@example.com", "098-765-4321"));
            Contact test1 = new Contact("Alice", "alice@example.com", "647-111-6811");
            manager.addContact(test1);

            // List contacts
            manager.listContacts();
    
            // Test cases
            manager.removeContact("Alaadin"); //Normal removal
            manager.removeContact("Shahzan"); //Adding contact that doesn't exist
            manager.addContact(test1); //Add contact that has been previously added
            //Other test cases
            /*
             * Input validation: Valid email address format ex. a contact with an email of "1234" is invalid
             * Input validation: Valid phone number format ex. a contact with the phone number "acbd" is invalid
             */
            
    
            // List contacts again to see the change
            manager.listContacts();
            
        }
}
