/* A college wants to develop a simple Java Application to manage student records and authenticate users.

    Requirements:
    1. Create a class Student with attributes :
            rolllNumber, 
            studentName,
            marks
        initialize student details using constructor

        Create a static variable to store the college name
        Create a static method to displayCollegename() to display the college name

        Implement a method Overloading by Creating multiple dislpayInfo() methods .
            - displayInfo(int rollNumber, String studentName)
            - displayInfo(int rollNumber, String studentName, double marks )
    
        2. Login Authenticate System:
        Create a class LoginSystem with attributes:
        Store a predefined username and password as static variables.
        Implement a method authenticate(String username, String password) to verify user credentials.
        Validate user credentials and display :
            - "Login Successful" if credentials match
            - "Invalid Username or Password" .

        3. Main Application class 
        Create a class named CollegeApp with a main method to:
        In the main method:
            -Create an object of student class and demostrate constructor and method overloading
            -Call the static method to display college name
            -perform user authentication using the overloaded login() methods 
            -Accept required inputs from the user using Scanner class. 
*/  

package java_2;

import java.util.*;

class StudentDetails {
    int rolllNumber;
    String studentName;
    double marks;

    StudentDetails(int rolllNumber, String studentName, int marks) {
        this.rolllNumber = rolllNumber;
        this.studentName = studentName;
        this.marks = marks;
    }

    static String collegeName = "Adamas University";

    static void displayCollegename() {
        System.out.println("College Name: " + collegeName);
    }

    void displayInfo(int rollNumber, String studentName) {
        System.out.println("Roll Number: " + rollNumber + ", Student Name: " + studentName);

    }

    void displayInfo(int rollNumber, String studentName, double marks) {
        System.out.println("Roll Number: " + rollNumber + ", Student Name: " + studentName + ", Marks: " + marks);

    }
}

class Authentication {

    static String username = "admin";
    static String password = "password123";

    void login(String username) {
        if (username.equals(Authentication.username)) {
            System.out.println("Login Successful");
        } else {
            System.out.println("Invalid Username or Password");
        }
    }

    void login(String username, String password) {
        if (username.equals(this.username) && password.equals(this.password)) {
            System.out.println("Login Successful");
        } else {
            System.out.println("Invalid Username or Password");
        }
    }
}

class CollegeApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Roll Number:");
        int rollNumber = sc.nextInt();

        sc.nextLine();
        
        System.out.print("Enter Student Name:");
        String studentName = sc.nextLine();

        System.out.print("Enter Marks:");
        int marks = sc.nextInt();

        sc.nextLine();
        System.out.print("\nEnter Username: ");
        String user = sc.nextLine();

        // sc.nextLine();
        System.out.print("Enter Password: ");
        String pass = sc.nextLine();

        // authentication auth = new authentication();

        Authentication auth = new Authentication();

        // Authenticate User
        auth.login(user, pass);

        StudentDetails student = new StudentDetails(rollNumber, studentName, marks);
    }
}