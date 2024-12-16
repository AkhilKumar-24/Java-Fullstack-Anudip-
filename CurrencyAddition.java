package akhil;
import java.util.Scanner;

public class CurrencyAddition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first amount dollars: ");
        int d1 = scanner.nextInt();
        System.out.print("Enter first amount cents: ");
        int c1 = scanner.nextInt();

        System.out.print("Enter second amount dollars: ");
        int d2 = scanner.nextInt();
        System.out.print("Enter second amount cents: ");
        int c2 = scanner.nextInt();

        int totalCents = c1 + c2;
        int extraDollars = totalCents / 100;  
        int finalCents = totalCents % 100;
        int totalDollars = d1 + d2 + extraDollars;

        System.out.println("Total Amount: " + totalDollars + " dollars and " + finalCents + " cents");
    }
}
