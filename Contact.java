//Carmen T - 0738392 - Contact.java

//This code houses the body of the contact object (provided for lab 2)

// Define the Contact class
class Contact {
    // Properties of the Contact class
    //Set default properties since we are validating the data.
    private String name = "No name.";
    private String email = "No email.";
    private String phoneNumber = "No phone number";

    // Constructor to initialize a new Contact object
    public Contact(String name, String email, String phoneNumber) {
        if (!(name.equals("") || name.equals(" ")))
            this.name = name;
        //Ensure the email is of valid format
        if ((email.contains("@") && email.contains(".")))
            this.email = email;
        //Ensure the phone number is of valid format
        //I'm being lazy by validating the length, but you get the point.
        if ((phoneNumber.replace("-", "").length() == 10))
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
    // ...
    //I'm gonna make a couple getters and setters, realizstically we only need name's getter but eh

    //Getter for the name of the contact
    public String getName(){
        return this.name;
    }

    //Since you said to only add getters and setters if necessary, i'm only going to add
    //getName, however, adding further encapsulation could be done to make the code more accessible if needed
}