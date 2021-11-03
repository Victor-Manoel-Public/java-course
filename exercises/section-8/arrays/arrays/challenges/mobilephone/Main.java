package arrays.challenges.mobilephone;

import java.util.Scanner;

public class Main {

    private static Scanner sc = new Scanner(System.in);
    private static MobilePhone phone = new MobilePhone("1122334455");

    public static void main(String[] args) {
        boolean quit = false;
        phone.startPhone();
        printInstructions();

        while(!quit){
            System.out.print("\n\tEnter an option > ");
            int option = sc.nextInt();
            sc.nextLine();

            switch (option){
                case 0:
                    System.out.println("The phone is powering off!");
                    System.out.println("Goodbye");
                    quit = true;
                    break;
                case 1:
                    phone.printContacts();
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    queryContact();
                    break;
                default:
                    printInstructions();
            }

        }

    }

    private static void addNewContact() {
        System.out.println("Enter new contact name: ");
        String name = sc.nextLine();
        System.out.println("Enter phone number: ");
        String phoneNumber = sc.nextLine();
        Contact newContact = Contact.createContact(name, phoneNumber);
        if(phone.addContact(newContact)) {
            System.out.println("New contact added: name = " + name + ", phone = "+ phoneNumber);
        } else {
            System.out.println("Cannot add, " + name + " already on file");
        }

    }

    public static void updateContact(){
        System.out.println("Enter existing name: ");
        String name = sc.nextLine();
        Contact existingContact = phone.queryContact(name);
        if (existingContact == null){
            System.out.println("Contact not found");
        }

        System.out.print("Enter new contact name for " + name + ": ");
        String newName = sc.nextLine();
        System.out.print("Enter new phone number for " + name + ": ");
        String newPhoneNumber = sc.nextLine();
        Contact contact = Contact.createContact(newName, newPhoneNumber);
        System.out.println(
                phone.updateContact(existingContact, contact) ?
                        name + " was successfully updated to " + newName :
                        "An error occurred while updating."
        );
    }

    public static void removeContact() {
        System.out.println("Enter name to remove: ");
        String name = sc.nextLine();
        Contact existingContact = phone.queryContact(name);
        if (existingContact == null) {
            System.out.println("Contact not found");
        }

        System.out.println(
                phone.removeContact(existingContact) ?
                        "Contact deleted successfully" :
                        "Error occurred while deleting contact."
        );
    }

    public static void printInstructions() {
        System.out.print(
                "Press" +
                        "\n\t0 - to shutdown" +
                        "\n\t1 - to print all contacts" +
                        "\n\t2 - to add a new contact" +
                        "\n\t3 - to update an existing contact" +
                        "\n\t4 - to remove a contact" +
                        "\n\t5 - to search a contact" +
                        "\n\t6 - to print instructions"

        );
    }

    public static void queryContact() {
        System.out.println("Enter name to query: ");
        String name = sc.nextLine();
        Contact existingContact = phone.queryContact(name);
        if (existingContact == null) {
            System.out.println("Contact not found");
        }else{
            System.out.println(
                    existingContact.getName() + " -> " + existingContact.getPhoneNumber()
            );
        }

    }


}


