package java_2;

// Define a class
class Student {

    // Data members (attributes)
    private int id;
    private String name;

    // Constructor
    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Method to display details
    public void displayDetails() {
        System.out.println("Student ID: " + id);
        System.out.println("Student Name: " + name);
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        // Creating object of Student class
        Student s1 = new Student(101, "Akshat");

        // Calling method using object
        s1.displayDetails();
    }
}
