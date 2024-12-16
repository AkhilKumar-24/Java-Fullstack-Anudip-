package akhil;

import java.util.Scanner;

public class TicTacToeInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a position (1-9): ");
        int userInput = scanner.nextInt();
        
        if (userInput < 1 || userInput > 9) {
            System.out.println("Invalid input! Please enter a number between 1 and 9.");
            return;
        }

        int row = (userInput - 1) / 3;
        int column = (userInput - 1) % 3;

        System.out.println("Position in 2D array: (" + row + ", " + column + ")");
    }
}


