package akhil;

import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();  // Read input number
        scanner.close();

        if (isStrongNumber(number)) {
            System.out.println("Yes");  // Print "Yes" if it's a strong number
        } else {
            System.out.println("No");  // Print "No" otherwise
        }
    }

    // Function to check if a number is a strong number
    public static boolean isStrongNumber(int num) {
        int originalNumber = num;  // Store the original number
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;  // Extract the last digit
            sum += factorial(digit);  // Add factorial of the digit to sum
            num /= 10;  // Remove the last digit
        }

        return sum == originalNumber;  // Check if sum equals the original number
    }

    // Function to calculate factorial of a number
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}

