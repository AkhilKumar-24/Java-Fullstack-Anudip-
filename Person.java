package akhil;

public class Person {
    // Attributes
    String firstName;
    String lastName;
    int age;

    // Constructor to initialize the attributes
    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    // Method to return the full name of the person
    public String fullName() {
        return firstName + " " + lastName;
    }

    // Main method to test the class
    public static void main(String[] args) {
        // Creating an object of the Person class
        Person person = new Person("Akhil", "Kumar", 22);
        
        // Printing the full name of the person
        System.out.println("Full Name: " + person.fullName());
        System.out.println("Age: " + person.age);
    }
}
