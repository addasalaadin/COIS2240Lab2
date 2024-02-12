import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Define the Contact class
class Contact {
    // Properties of the Contact class
    private String name;
    private String email;
    private String phoneNumber;

    // Constructor to initialize a new Contact object
    public Contact(String name, String email, String phoneNumber) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    // Implement the toString method for Contact
    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

    // Getters and Setters (if necessary)

    //Getter for name
    public String getName() {
        return this.name;
    }

    //Getter for email
    public String getEmail() {
        return this.email;
    }

    //Getter for phone number
    public String getPhoneNumber() {
        return this.phoneNumber;
    }
}