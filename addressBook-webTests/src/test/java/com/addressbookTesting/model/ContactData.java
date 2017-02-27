package com.addressbookTesting.model;

public class ContactData {
    public void setId(int id) {
        this.id = id;
    }

    private  int id;
    private final String userName;
    private final String lastName;
    private final String phoneNumber;
    private String group;


    public ContactData(String userName, String lastName, String PhoneNumber, String Group) {
        this.id=Integer.MAX_VALUE;
        this.userName = userName;
        this.lastName = lastName;
        this.phoneNumber = PhoneNumber;
        this.group = Group;

    }

    public ContactData(int id,String userName, String lastName, String PhoneNumber, String Group) {
        this.id=id;
        this.userName = userName;
        this.lastName = lastName;
        this.phoneNumber = PhoneNumber;
        this.group = Group;
    }
    public int getId() {return id;}

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

    @Override
    public String toString() {
        return "ContactData{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ContactData that = (ContactData) o;

        return userName != null ? userName.equals(that.userName) : that.userName == null;

    }

    @Override
    public int hashCode() {
        return userName != null ? userName.hashCode() : 0;
    }
}
