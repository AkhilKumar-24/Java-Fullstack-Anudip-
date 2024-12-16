package akhil;

public class Pattern {
    public static void main(String[] args) {
        // Number of rows in the pattern
        int rows = 5;

        // Loop for each row
        for (int i = rows; i >= 1; i--) {
            // Loop to print stars in each row
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            // Move to the next line
            System.out.println();
        }
    }
}

