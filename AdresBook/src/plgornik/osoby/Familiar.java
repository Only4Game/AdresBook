package plgornik.osoby;

public class Familiar extends Person{

    private String interests;

    public Familiar(String name, String surename, String phoneNumber, String interests) {
        super(name, surename, phoneNumber);
        this.interests = interests;
    }

    @Override
    public void displayInfo() {
        System.out.println("Znajomy\n--------------\nImie: " + getName() + "\n Nazwisko: " +
                getSurename() + "\n Telefon: " + getPhoneNumber() + "\n Zainteresowania: " + interests + "\n--------------");
    }
}
