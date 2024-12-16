package akhil;

import java.util.Scanner;

public class StudentMarks {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Input subject marks
        System.out.println("Enter marks for Subject 1: ");
        int subject1 = scanner.nextInt();
        
        System.out.println("Enter marks for Subject 2: ");
        int subject2 = scanner.nextInt();
        
        System.out.println("Enter marks for Subject 3: ");
        int subject3 = scanner.nextInt();
        
        System.out.println("Enter marks for Subject 4: ");
        int subject4 = scanner.nextInt();
        
        System.out.println("Enter marks for Subject 5: ");
        int subject5 = scanner.nextInt();
        
        // Calculate total marks
        int totalMarks = subject1 + subject2 + subject3 + subject4 + subject5;
        
        // Calculate the percentage (assuming each subject is out of 100 marks)
        double percentage = (totalMarks / 5.0);
        
        // Determine grade using switch case
        char grade;
        int percentRange = (int) percentage / 10; // Dividing by 10 to group percentages (90-100 = 9, 80-89 = 8, etc.)
        
        switch (percentRange) {
            case 10: // 100%
            case 9:  // 90-99%
                grade = 'A';
                break;
            case 8:  // 80-89%
                grade = 'B';
                break;
            case 7:  // 70-79%
                grade = 'C';
                break;
            case 6:  // 60-69%
                grade = 'D';
                break;
            case 5:  // 50-59%
                grade = 'E';
                break;
            default: // Below 50%
                grade = 'F';
                break;
        }
        
        // Print the total marks, percentage, and grade
        System.out.println("\n--- Student Result ---");
        System.out.println("Total Marks: " + totalMarks + " / 500");
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);
        
        // Close the scanner
        scanner.close();
    }
}
