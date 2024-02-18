import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//Define the ContactManager class
class ContactManager 
{
    //List to store Contact objects
    private List<Contact> contacts;

    //Constructor to initialize the ContactManager
    public ContactManager() 
    {
        contacts = new ArrayList<>();
    }

    //Method to add a new Contact
    public void addContact(Contact contact) 
    {
        //Added code here
        contacts.add(contact);
    }

    //Method to remove a Contact by name
    public void removeContact(String name) 
    {
        //Added code here
        //Iterating through contacts list
        for (int i = 0; i < contacts.size(); i++) 
            {
                //Assigning the Contact object at current index to variable contact, allowing to access attributes and setters
                Contact contact = contacts.get(i);
                
                    //Checking if the contact matches a title of a specific instantion of Contact
                    if (contact.getName().equalsIgnoreCase(name)) 
                    {
                        contacts.remove(i);
                        System.out.println("Contact removed: " + contact);
                        return; 
                    }
            }
            //If the contact with the provided name is not found
            System.out.println("Unable to find contact named " + name );
    }

    //Method to list all Contacts
    public void listContacts() 
    {
        //Added code here
        //Iterating through contacts list
        for (int i = 0; i < contacts.size(); i++) 
        {
            //Assigning the Contact object at current index to variable contact, allowing to access attributes and getters
            Contact contact = contacts.get(i);
            System.out.println(contact.toString());
        }
    }

}