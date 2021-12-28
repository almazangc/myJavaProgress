package com.almazan.Section8.InbuiltList.MobilePhone;

/**
 * Composition Class for MobilePhone
 */
public class Contact {

    /**
     * Encapsulated fields
     */
    private String name;
    private String phoneNumber;

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * createContact crates and returns a Contact instance containing name, and phoneNumber
     * @param name user defined name
     * @param phoneNumber user define phoneNumber
     * @return Contact instance
     */
    public static Contact createContact(String name, String phoneNumber) {
        return new Contact(name, phoneNumber);
    }
}
