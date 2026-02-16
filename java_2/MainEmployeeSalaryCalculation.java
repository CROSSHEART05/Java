package java_2;

import java.util.Scanner;

public class MainEmployeeSalaryCalculation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Basic Salary: ");
        double salary = sc.nextDouble();

        Salary emp = new Salary(id, name, salary);
        emp.DispalyDetails();

        sc.close();
    }
}
