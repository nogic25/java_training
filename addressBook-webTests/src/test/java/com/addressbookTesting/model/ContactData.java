package com.addressbookTesting.model;

public class ContactData {
    private final String userName;
    private final String lastName;
    private final String phoneNumber;
    private String group;

    public ContactData(String userName, String lastName, String PhoneNumber, String Group) {
        this.userName = userName;
        this.lastName = lastName;
        this.phoneNumber = PhoneNumber;
        this.group = Group;
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

    public String getGroup() {
        return group;
    }
}
