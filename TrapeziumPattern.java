package akhil;

import java.util.Scanner;

public class TrapeziumPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt(); // Input the number of rows
        scanner.close();
        
        int startNum = 1;
        int endNum = rows * (rows + 1); // Calculate the maximum number for the pattern
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < i * 2; j++) 
                System.out.print("-"); // Print dashes
            
            int count = rows - i;
            for (int j = 0; j < count; j++) 
                System.out.print(startNum++ + "*"); // Print first half of numbers with *
            
            for (int j = 0; j < count; j++) 
                System.out.print(endNum - count + j + 1 + (j < count - 1 ? "*" : "")); // Print second half of numbers with *
            
            endNum -= count; // Update end number for next row
            System.out.println(); // Move to the next row
        }
    }
}
