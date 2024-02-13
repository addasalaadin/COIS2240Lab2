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
    // ...
    // Getter method to retrieve the value of the 'name' property
    public String getName() {
        return name;
    }

    // Setter method to set the value of the 'name' property
    public void setName(String name) {
        this.name = name;
    }
}