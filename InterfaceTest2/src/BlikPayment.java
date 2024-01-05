import java.util.Scanner;

public class BlikPayment implements Payment {
    @Override
    public void makePayment(double amount) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Płatność BLIK");
        System.out.println("Podaj kod BLIK: \n>>>");
        int blikCode = scanner.nextInt();

        System.out.println("Kod blik: " + blikCode);
        System.out.printf("Pobrano z konta %.2f zł", amount);
    }

}
