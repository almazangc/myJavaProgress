package com.almazan.Section8.InbuiltList.MobilePhone;

import java.util.ArrayList;

/**
 * Master Class MobilePhone
 */
public class MobilePhone {

    /**
     * Encapsulated Fields
     */
    private ArrayList<Contact> myContacts;

    /**
     * Constructor that takes a String (the phone number) and initialises PhoneName and instantiates myContacts.
     */
    public MobilePhone() {
        this.myContacts = new ArrayList<Contact>();
    }

    /**
     * addNewContact(), has one parameter of type Contact.
     * @param contact being checked
     * @return true if the contact doesn't exists, or false if the contact already exists.
     */
    public boolean addNewContact(Contact contact) {
        if (myContacts.contains(contact)) {
            System.out.println("Contact already exist");
            return true;
        }

        this.myContacts.add(contact);
        System.out.println(contact.getName() + ", was added to contact list");
        return false;
    }

    /**
     * updateContact(), has two parameters of type Contact (the old contact that will be updated with the new contact).
     * @param oldContact list
     * @param newContact list
     * @return true if the contact exists and was updated successfully, or false if the contact doesn't exists.
     */
    public boolean updateContact(Contact oldContact, Contact newContact) {
        int position = findContact(oldContact);
        if(position < 0) {
            System.out.println(oldContact.getName() +", was not found, no updates performed");
            return false;
        } else if(findContact(newContact) != -1) {
            System.out.println("Contact with name " + newContact.getName() + " already exists.  Update was not successful.");
            return false;
        }

        this.myContacts.set(position, newContact);
        System.out.println(oldContact.getName() + ", was replaced with " + newContact.getName());
        return true;
    }

    /**
     * removeContact(), has one parameter of type Contact.
     * @param contact list
     * @return true if the contact exists and was removed successfully, or false if the contact doesn't exists.
     */
    public boolean removeContact(Contact contact) {
        if (findContact(contact) > -1) {
            this.myContacts.remove(contact);
            System.out.println(contact.getName() + ", was deleted");
            return true;
        }
        System.out.println(contact.getName() + ", was not found.");
        return false;
    }

    /**
     * findContact(), has one parameter of type Contact.
     * @param contact list
     * @return returns value is it's position in the ArrayList, it will either be -1 (doesn't exists) or a value greater than or equal to 0 (does exists).
     */
    private int findContact(Contact contact) {
        return this.myContacts.indexOf(contact);
    }

    /**
     * findContact(), overload method.
     * @param name string name being searched
     * @return returns value is it's position in the ArrayList, it will either be -1 (doesn't exists) or a value greater than or equal to 0 (does exists).
     */
    private int findContact(String name) {
        for(Contact inContacts : this.myContacts)
            if(inContacts.getName().equalsIgnoreCase(name)) //.equals case sensitive
                return this.myContacts.indexOf(inContacts); //cannot call a method being overloaded myContacts.findContacts(inContacts)
        
        return -1; //Returns -1 if not in list
    }

    /**
     * queryContact(), has one parameter of type String and returns a Contact.
      * @param searchContactName Use the String to search for the name.
     * @return if name is searched returns the Contact otherwise null.
     */
    public Contact queryContact(String searchContactName) {
        return this.myContacts.get(findContact(new Contact(searchContactName, "")));
    }

    /**
     * printContacts(), has no parameters and doesn't return anything.
     */
    public void printContacts() {
        System.out.println("Contact List: ");
        for (int i = 0, position = 1; i < this.myContacts.size(); i++, position++){
            Contact contact = this.myContacts.get(i);
            System.out.printf("%d. %s -> %s\n",position, contact.getName(), contact.getPhoneNumber());
        }
    }
}
