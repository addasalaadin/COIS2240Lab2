public class Program {
    public static void main(String[] args) {
        ContactManager manager = new ContactManager();

        manager.addContact(new Contact("Alaadin", "alaadin@trentu.ca", "123-456-7890"));
        manager.addContact(new Contact("Bob", "bob@example.com", "098-765-4321"));

        manager.listContacts();

        manager.removeContact("Alaadin");

        System.out.println("After removing Alaadin:");
        manager.listContacts();
    }
}
