package akhil;

public class NumberPattern {
    public static void main(String[] args) {
        // Number of rows in the pattern
        int rows = 4;

        // Loop for each row
        for (int i = 1; i <= rows; i++) {
            // Print numbers in increasing order from 1 to i
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            // Print numbers in decreasing order from i-1 to 1
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }

            // Move to the next line
            System.out.println();
        }
    }
}
