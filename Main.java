package akhil;

// Base class Shape
class Shape {
    // Method to be overridden by subclasses
    public double getArea() {
        System.out.println("getArea() method in Shape class.");
        return 0;
    }
}

// Subclass Circle
class Circle extends Shape {
    private int radius;

    // Constructor to initialize radius
    public Circle(int radius) {
        this.radius = radius;
    }

    // Overriding getArea() to calculate area of circle
    @Override
    public double getArea() {
        return Math.PI * radius * radius; // Area = πr^2
    }
}

// Subclass Square
class Square extends Shape {
    private int length;

    // Constructor to initialize length
    public Square(int length) {
        this.length = length;
    }

    // Overriding getArea() to calculate area of square
    @Override
    public double getArea() {
        return length * length; // Area = side^2
    }
}

// Subclass Rectangle
class Rectangle extends Shape {
    private int width, height;

    // Constructor to initialize width and height
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    // Overriding getArea() to calculate area of rectangle
    @Override
    public double getArea() {
        return width * height; // Area = width * height
    }
}

// Main class to test the Shape hierarchy
public class Main{
    public static void main(String[] args) {
        // Create objects of each subclass
        Circle circle = new Circle(5); // Radius = 5
        Square square = new Square(4); // Side length = 4
        Rectangle rectangle = new Rectangle(3, 7); // Width = 3, Height = 7

        // Display the areas of the shapes
        System.out.println("Area of Circle: " + circle.getArea());
        System.out.println("Area of Square: " + square.getArea());
        System.out.println("Area of Rectangle: " + rectangle.getArea());
    }
}
