package plgornik.osoby;

public abstract class Person {
    private String name;
    private String surename;
    private String phoneNumber;

    public Person(String name, String surename, String phoneNumber) {
        this.name = name;
        this.surename = surename;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurename() {
        return surename;
    }

    public void setSurename(String surename) {
        this.surename = surename;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public abstract void displayInfo();

    public void changeInfo(String name, String surename, String phoneNumber){
        this.name = name;
        this.surename = surename;
        this.phoneNumber = phoneNumber;
    }
}
