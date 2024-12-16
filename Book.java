package akhil;
public class Book {
    // Attributes
    String title;
    String author;
    double price;

    // Default Constructor - initializes the attributes to default values
    public Book() {
        this.title = "Untitled";
        this.author = "Unknown";
        this.price = 0.0;
    }

    // Parameterized Constructor - initializes the attributes with provided values
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Method to display the book's details
    public void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
        System.out.println("---------------------------");
    }

    // Main method to demonstrate the use of both constructors
    public static void main(String[] args) {
        // Using the default constructor
        Book defaultBook = new Book();
        System.out.println("Default Book Details:");
        defaultBook.display();

        // Using the parameterized constructor
        Book customBook = new Book("The Alchemist", "Paulo Coelho", 299.99);
        System.out.println("Custom Book Details:");
        customBook.display();
    }
}
