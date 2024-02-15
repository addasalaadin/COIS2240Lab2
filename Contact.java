import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Define the Contact class
class Contact 
{
    // Properties of the Contact class
    private String name;
    private String email;
    private String phoneNumber;

    // Constructor to initialize a new Contact object
    public Contact(String name, String email, String phoneNumber) 
    {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    // Implement the toString method for Contact
    @Override
    public String toString() 
    {
        return "Contact{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

    // Get the name
public String getName() 
{
    return name;
}

// Set the name
public void setName(String name) 
{
    this.name = name;
}

// Get the email
public String getEmail() 
{
    return email;
}

// Set the email
public void setEmail(String email) 
{
    this.email = email;
}

// Get the phone number 
public String getPhoneNumber() 
{
    return phoneNumber;
}

// Set the phone number
public void setPhoneNumber(String phoneNumber) 
{
    this.phoneNumber = phoneNumber;

}

}