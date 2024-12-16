package akhil;

	import java.util.Scanner;

	public class TrendyNumberChecker {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a three-digit number: ");
	        int number = scanner.nextInt();
	        
	        if (number < 100 || number > 999) {
	            System.out.println("The number is not a three-digit number.");
	        } else {
	           
	            int middleDigit = (number / 10) % 10;

	            if (middleDigit % 3 == 0) {
	                System.out.println(number + " is a trendy number.");
	            } else {
	                System.out.println(number + " is not a trendy number.");
	            }
	        }

	        scanner.close();
	    }
	}