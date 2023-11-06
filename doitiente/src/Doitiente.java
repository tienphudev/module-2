import java.util.Scanner;

public class Doitiente {
    public static void main(String[] args) {
        double rate = 23000;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your money");
        double moneyUSD = scanner.nextDouble();
        double moneyVND = moneyUSD*rate;
        System.out.println(moneyVND);
}}
