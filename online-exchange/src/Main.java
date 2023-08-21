import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("gebe dein Betrag in Euro an: ");
        Double money = scanner.nextDouble();

        convertToDollars(money);
        convertToYen(money);
    }
    public static void convertToDollars(Double eur) {
        System.out.println("beträgt: " + eur * 1.20 + " Dollar");
    }
    public static void convertToYen(Double eur) {
        System.out.println("beträgt: " + eur * 1.32 + " Yen");
    }


}