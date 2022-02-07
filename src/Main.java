import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter USD exchange to VND: ");
        double usd = scanner.nextDouble();
        double vnd = usd*23000;
        System.out.print(usd + " USD = " + vnd + " VND");
    }
}
