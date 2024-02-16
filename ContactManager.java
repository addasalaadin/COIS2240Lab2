//Carmen T - 0736392 - ContactManager.java

//This code houses the ContactManager object which is a list of Contact objects
import java.util.ArrayList;
import java.util.List;

// Define the ContactManager class
class ContactManager {
    // List to store Contact objects
    private List<Contact> contacts;

    // Constructor to initialize the ContactManager
    public ContactManager() {
        contacts = new ArrayList<>();
    }

    // Method to add a new Contact
    public void addContact(Contact contact) {
        // Your code here
        //Try to add the contact to our list
        try {
            //The code will not have an issue adding a null contact, so let's check for that
            if (contact == null)
                throw new Exception("cringe");
            contacts.add(contact);
        }
        //Something went wrong, lets catch the error and inform the user.
        catch (Exception e){
            System.out.println("Something went wrong trying to add the contact");
        }

    }

    // Method to remove a Contact by name
    public void removeContact(String name) {
        // Your code here

        //Hmm, there's probably a better optimized way to do this but ehhh, this will work

        for (int i = 0; i<contacts.size();i++){
            //Check if the contact in the list shares the same name
            if (name.equalsIgnoreCase(contacts.get(i).getName())){
                //We found our contact at index i
                //Great, now remove it
                contacts.remove(i);
                //We can also optimize this by returning immediately after instead of searching for more.
                //This also ensures we only remove one contact at a time.
                return;
            }
        }
        //Since we returned earlier, the code will only reach this point if the contact was not
        //found to be removed. Let's inform the user.
        System.out.printf("\nFailed to find the contact with the name \"%s\".\n", name);
    }

    // Method to list all Contacts
    public void listContacts() {
        // Your code here
        //Considering this is a void method, I assume you want me printing these?
        //each contact has an overridden tostring method also,
        //so we can just loop through them ig
        System.out.println("\nListing Contacts:");
        //Print all contacts, we can use foreach as we are not adjusting our contacts.
        for (Contact c : contacts){
            System.out.println(c.toString());
        }
    }


}