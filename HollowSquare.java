package akhil;
import java.util.Scanner;

public class HollowSquare {
    public static void main(String[] args) {
        // Create a scanner object to read input
        Scanner scanner = new Scanner(System.in);
        
        // Read the input for number of rows and columns
        int n = scanner.nextInt();
        
        // Loop through each row
        for (int i = 1; i <= n; i++) {
            // Loop through each column
            for (int j = 1; j <= n; j++) {
                // Print '*' for the boundary rows and columns
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("*");
                } else {
                    // Print space for the hollow part
                    System.out.print(" ");
                }
            }
            // Move to the next line after printing one row
            System.out.println();
        }
        
        // Close the scanner object
        scanner.close();
    }
}
