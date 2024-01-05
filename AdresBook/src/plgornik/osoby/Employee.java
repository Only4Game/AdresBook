package plgornik.osoby;

public class Employee extends Person{
    private String position;

    public Employee(String name, String surename, String phoneNumber, String position) {
        super(name, surename, phoneNumber);
        this.position = position;
    }

    @Override
    public void displayInfo() {
        System.out.println("Pracownik\n--------------\nImie: " + getName() + "\n Nazwisko: " +
                getSurename() + "\n Telefon: " + getPhoneNumber() + "\n Stanowisko: " + position + "\n--------------");
    }
}
