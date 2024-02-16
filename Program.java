//Carmen T - 0736392 - Program.java

//This code will house our testing for Lab2
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
    
            // List contacts again to see the change
            manager.listContacts();

            //Hooray, the contact is removed as expected.

            //Let's try removing a non-existent contact
            manager.removeContact("cringe");
            //Notice, we are warned, and finally list the contacts again to see no change (duh)
            manager.listContacts();

            //What happens if we add a contact with null input?
            manager.addContact(null);
            //We caught it earlier, so the code will not stop, we do get an exception though.
            //Note that the code tells us something went wrong.

            //Now let's try a bad contact object
            manager.addContact(new Contact("", "", ""));
            //This contact has empty strings everywhere, what happens?
            //We can catch this, in the contact object.

            //Finally, when we print all contacts again, we can see that the default values are used since the
            //properties being passed to the constructor are not valid.
            //No name. No email. No phone number respectively.

            manager.listContacts();
        }
}
