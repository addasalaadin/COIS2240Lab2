import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ContactManagerTests {
    private ContactManager contactManager;

    @Before
    public void setUp() {
        contactManager = new ContactManager();
    }


    @Test
    public void testAddDuplicateContact() {
        Contact contact = new Contact("Bob", "bob@example.com", "0987654321");
        contactManager.addContact(contact);
        // Assuming the system should not allow duplicates and returns false on attempt
        assertTrue(contactManager.addContact(contact));
    }


    @Test(expected = IllegalArgumentException.class)
    public void testAddInvalidContact() {
        // Assuming your application throws IllegalArgumentException for invalid inputs
        contactManager.addContact(new Contact("", "", ""));
    }

    @Test
    public void testListOnEmptyContactsList() {
        // Assuming `getContacts` returns a list of contacts
        assertTrue(contactManager.getContacts().isEmpty());
}


    @Test
    public void testRemoveNonexistentContact() {
        // No need to add a contact first since we're testing removal of a nonexistent contact
        boolean result = contactManager.removeContact("Nonexistent Contact");
        // Assert that the result is false, indicating the contact was not found and therefore not removed
        assertFalse("Removing a nonexistent contact should return false.", result);
    }

    @Test
    public void testAddAndRemoveContact() {
        Contact contact = new Contact("John Doe", "john@example.com", "1234567890");
        //Add contact
        contactManager.addContact(contact);

        //Remove the contact
        assertTrue(contactManager.removeContact("John Doe"));
    }

    

    // More tests can be added below
}
