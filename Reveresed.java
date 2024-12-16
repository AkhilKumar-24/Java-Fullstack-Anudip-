package akhil;

public class Reveresed {
    public static void main(String[] args) {
        //  Initialize a string to be reversed
        String str = "Hello World"; // The string to be reversed

        //  Reverse the string using StringBuilder and convert it back to a string
        String reversed = new StringBuilder(str).reverse().toString(); // Reverse and convert to a string

        //  Print the reversed string to the console
        System.out.println(reversed); // Output will be "dlroW olleH"
    }
}