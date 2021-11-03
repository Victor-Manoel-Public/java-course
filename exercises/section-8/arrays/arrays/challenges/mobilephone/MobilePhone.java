package arrays.challenges.mobilephone;

import java.util.ArrayList;

public class MobilePhone {

    private String myNumber;
    private ArrayList<Contact> contacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.contacts = new ArrayList<Contact>();
    }

    public void startPhone(){
        try{
            System.out.println("Phone is starting...");
            Thread.sleep(2000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    private int findContact(Contact contact){
        return this.contacts.indexOf(contact);
    }

    private int findContact(String contactName){
        for (int i = 0; i < contacts.size(); i++) {
            Contact contact = this.contacts.get(i);
            if (contact.getName().equals(contactName)){
                return i;
            }
        }
        return -1;
    }

    public boolean addContact(Contact contact){
        if( findContact(contact.getName()) >= 0 ){
            System.out.println("Contact already in list!");
            return false;
        }

        contacts.add(contact);
        return true;
    }

    public boolean updateContact(Contact oldContact, Contact newContact){
        int position = findContact(oldContact);
        if( position < 0){
            System.out.println( oldContact.getName() + " was not found");
            return false;
        }
        this.contacts.set(position, newContact);
        System.out.println(oldContact.getName() + " was replaced by " + newContact.getName());
        return true;
    }

    public boolean removeContact(Contact contact){
        int position = findContact(contact);
        if(position < 0){
            System.out.println(contact.getName() + " was not found.");
            return false;
        }

        this.contacts.remove(position);
        System.out.println(contact.getName() + " was deleted.");
        return true;
    }

    public String queryContact(Contact contact){
        return (findContact(contact) >= 0 ) ? contact.getName() : null;
    }

    public Contact queryContact(String name){
        int position = findContact(name);
        if (position >= 0){
            return this.contacts.get(position);
        }

        return null;
    }

    public void printContacts() {
        System.out.println("!=========! Contact List !=========!");
        if(this.contacts.size() <= 0){
            System.out.println("You don\'t have any contacts. Try add some!");
        }
        for (int i = 0; i < this.contacts.size(); i++) {
            System.out.println( "\n\t" + (i+1) + "-> " +
                    this.contacts.get(i).getName() + "= " + this.contacts.get(i).getPhoneNumber() );
        }
    }
}
