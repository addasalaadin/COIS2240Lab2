import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//Define the Contact class
class Contact 
{
    //Properties of the Contact class
    private String name;
    private String email;
    private String phoneNumber;

    //Constructor to initialize a new Contact object
    public Contact(String name, String email, String phoneNumber) 
    {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    //Implement the toString method to provide a string representation of a Contact object
    @Override
    public String toString() 
    {
        return "Contact{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

    //Getter & setter methods for name
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }

    //Getter & setter methods for email
    public String getEmail()
    {
        return email;
    }
    public void setEmail(String email)
    {
        this.email = email;
    }

    //Getter & setter methods for phone number
    public String getPhoneNumber()
    {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }
}