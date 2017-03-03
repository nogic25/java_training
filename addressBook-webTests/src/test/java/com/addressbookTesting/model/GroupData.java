package com.addressbookTesting.model;

public class GroupData {
    public GroupData withId(int id) {
        this.id = id;
        return this;
    }

    private  int id=Integer.MAX_VALUE;
    private  String name;
    private  String header;
    private  String footer;
//sample how to create cascades.( extend methods in the chain) First: generate setter. add return.
//   Method will return the same object where it is being called
    //fluent interface
    public GroupData withName(String name) {
        this.name = name;
        return this;
    }

    public GroupData withHeader(String header) {
        this.header = header;
        return this ;
    }

    public GroupData withFooter(String footer) {
        this.footer = footer;
        return this;
    }



   /* public GroupData(String name, String header, String footer) {

        this.name = name;
        this.header = header;
        this.footer = footer;
    }
*/

//    public GroupData(int id,String name, String header, String footer) {
//        this.id=id;
//        this.name = name;
//        this.header = header;
//        this.footer = footer;
//    }


    public int getId() {return id;}

    public String getName() {
        return name;
    }

    public String getHeader() {
        return header;
    }

    public String getFooter() {return footer;}

    @Override
    public String toString() {
        return "GroupData{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GroupData groupData = (GroupData) o;

        return name != null ? name.equals(groupData.name) : groupData.name == null;

    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }
}
