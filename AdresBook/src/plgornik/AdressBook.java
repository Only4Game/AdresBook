package plgornik;

import plgornik.osoby.Employee;
import plgornik.osoby.Familiar;
import plgornik.osoby.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AdressBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Person> persons = new ArrayList<>();
        initialize(persons);

        for(Person person: persons){
            person.displayInfo();
        }

        System.out.println(" ");
        System.out.println("---------------");
        System.out.println(" ");
        System.out.println("Podaj nr osoby w książce adresowej (1-4)");
        int nr = scanner.nextInt();
        scanner.nextLine();
        Person person = persons.get(nr-1);
        System.out.println("Podaj nowe imię: ");
        String name = scanner.nextLine();
        System.out.println("Podaj nowe nazwisko: ");
        String surename = scanner.nextLine();
        System.out.println("Podaj nowy numer telefonu: ");
        String phoneNumber = scanner.nextLine();

        person.changeInfo(name,surename,phoneNumber);
        person.displayInfo();
    }

    private static void initialize(List<Person> persons) {
        persons.add(new Employee("Edward","Podgrzybek","664221766","Łowca duchów"));
        persons.add(new Employee("Beata","Bąk","334776179","Sekretarka"));
        persons.add(new Familiar("Zygmunt","Mazur","547332766","Zjawiska paranormalne, religie świata, okultyzm, opium"));
        persons.add(new Familiar("Katarzyna","Łodyga","764112286","Sztuczna inteligencja AI, karty, spotkania"));
    }
}
