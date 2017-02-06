package com.addressbookTesting.model;

public class ContactData {
    private final String userName;
    private final String lastName;
    private final String phoneNumber;

    public ContactData(String userName, String lastName, String PhoneNumber) {
        this.userName = userName;
        this.lastName = lastName;
        phoneNumber = PhoneNumber;
    }

    public String getUserName() {
        return userName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
