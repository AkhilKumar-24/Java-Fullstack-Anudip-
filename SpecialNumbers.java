package akhil;

import java.util.Scanner;

public class SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the input values for m and n
        int m = scanner.nextInt();
        int n = scanner.nextInt();

        // Call the method to find and print the special numbers
        findSpecialNumbers(m, n);
    }

    // Method to find and print all special numbers in the range [m, n]
    public static void findSpecialNumbers(int m, int n) {
        boolean found = false;

        for (int num = m; num <= n; num++) {
            // Extract the tens and units digits
            int tens = num / 10;
            int units = num % 10;

            // Calculate the sum and product of the digits
            int sumOfDigits = tens + units;
            int productOfDigits = tens * units;

            // Check if the sum of the sum and product is equal to the number
            if (sumOfDigits + productOfDigits == num) {
                System.out.print(num + " ");
                found = true;
            }
        }

        // If no special number was found, print a message
        if (!found) {
            System.out.println("No special numbers found.");
        }
    }
}

