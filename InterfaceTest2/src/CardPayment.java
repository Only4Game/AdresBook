import java.util.Scanner;

public class CardPayment implements Payment{

    @Override
    public void makePayment(double amount) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Płatność kartą");
        System.out.println("Podaj numer karty");
        int cardNumber = scanner.nextInt();
        System.out.printf("Pobrano z karty o numerze %d kwotę %.2f zł\n", cardNumber, amount);
    }
}
