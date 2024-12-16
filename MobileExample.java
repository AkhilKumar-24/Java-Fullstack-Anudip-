package akhil;

// Class definition
class Mobile {
    String brand;
    String model;
    int price;

    // Default Constructor
    Mobile() {
        brand = "Unknown";
        model = "Unknown";
        price = 0;
        System.out.println("Default Constructor Called");
    }

    // Parameterized Constructor
    Mobile(String brand, String model, int price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        System.out.println("Parameterized Constructor Called");
    }

    // Copy Constructor
    Mobile(Mobile anotherMobile) {
        this.brand = anotherMobile.brand;
        this.model = anotherMobile.model;
        this.price = anotherMobile.price;
        System.out.println("Copy Constructor Called");
    }

    // Method to display mobile details
    void display() {
        System.out.println("Brand: " + brand + ", Model: " + model + ", Price: ₹" + price);
    }
}

// Main class
public class MobileExample {
    public static void main(String[] args) {
        // Using Default Constructor
        Mobile mobile1 = new Mobile();
        mobile1.display();

        // Using Parameterized Constructor
        Mobile mobile2 = new Mobile("Samsung", "Galaxy S22", 70000);
        mobile2.display();

        // Using Copy Constructor
        Mobile mobile3 = new Mobile(mobile2);
        mobile3.display();
    }
}
