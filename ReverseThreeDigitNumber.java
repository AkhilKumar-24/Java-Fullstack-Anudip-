package akhil;
import java.util.Scanner;
public class ReverseThreeDigitNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a 3-digit number: ");
        int num = scanner.nextInt();
        
        if (num < 100 || num > 999) {
            System.out.println("Please enter a valid 3-digit number.");
        } else {
            int reversedNum = reverseNumber(num);
            System.out.println("Reversed number: " + reversedNum);
        }
        
        scanner.close();
    }
    
    public static int reverseNumber(int num) {
        int hundreds = num / 100;  
        int tens = (num / 10) % 10; 
        int ones = num % 10; 
        
        int reversedNum = ones * 100 + tens * 10 + hundreds;
        
        return reversedNum;
    }
}

