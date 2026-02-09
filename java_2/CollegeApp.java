package java_2; 

import java.util.Scanner;

// Student Class
class Student {

    int rollNumber;
    String studentName;
    double marks;

    // Static Variable
    static String collegeName = "Adamas University";

    // Constructor
    Student(int rollNumber, String studentName, double marks) {
        this.rollNumber = rollNumber;
        this.studentName = studentName;
        this.marks = marks;
    }

    // Static Method
    static void displayCollegeName() {
        System.out.println("College Name: " + collegeName);
    }

    // Method Overloading
    void displayInfo(int rollNumber, String studentName) {
        System.out.println("Roll No: " + rollNumber);
        System.out.println("Name: " + studentName);
    }

    void displayInfo(int rollNumber, String studentName, double marks) {
        System.out.println("Roll No: " + rollNumber);
        System.out.println("Name: " + studentName);
        System.out.println("Marks: " + marks);
    }
}


// Login System Class
class LoginSystem {

    // Static Credentials
    static String Username = "admin";
    static String Password = "password123";

    // Authentication Method
    void authenticate(String username, String password) {

        if (username.equals(Username) &&
            password.equals(Password)) {

            System.out.println("Login Successful");

        } else {
            System.out.println("Invalid Username or Password");
        }
    }
}


// Main Class
public class CollegeApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Student Input
        System.out.print("Enter Roll Number: ");
        int roll = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Marks: ");
        double marks = sc.nextDouble();

        // Create Student Object
        Student s1 = new Student(roll, name, marks);

        // Demonstrate Overloading
        System.out.println("\n--- Display Without Marks ---");
        s1.displayInfo(roll, name);

        System.out.println("\n--- Display With Marks ---");
        s1.displayInfo(roll, name, marks);

        // Display College Name
        System.out.println();
        Student.displayCollegeName();


        // Login System
        sc.nextLine();

        System.out.print("\nEnter Username: ");
        String user = sc.nextLine();

        System.out.print("Enter Password: ");
        String pass = sc.nextLine();

        LoginSystem login = new LoginSystem();

        // Authenticate User
        login.authenticate(user, pass);

        sc.close();
    }
}
