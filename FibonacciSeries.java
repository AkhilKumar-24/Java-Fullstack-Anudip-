package akhil;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Input the limit for the Fibonacci series
        System.out.println("Enter the limit for the Fibonacci series: ");
        int limit = scanner.nextInt();
        
        // Variables to store the first two numbers of the Fibonacci series
        int a = 0, b = 1;
        
        System.out.println("Fibonacci series up to " + limit + ":");
        
        // Print the Fibonacci series up to the given limit
        while (a <= limit) {
            System.out.print(a + " ");
            int next = a + b; // Calculate the next Fibonacci number
            a = b; // Move to the next number
            b = next; // Update the next number
        }
        
        // Close the scanner
        scanner.close();
    }
}

