/*
 3. Create a Salary class that inherits from the Employee class and contains:
        o A method to calculate the total salary

4. The total salary should be calculated using the following rules:
        o House Rent Allowance (HRA): 20% of Basic Salary
        o Dearness Allowance (DA): 10% of Basic Salary
        o Total Salary = Basic Salary + HRA + DA

 5. Display the employee details and the total salary.

*/

package java_2;

public class Salary extends Employee{

    Salary(int id, String name, double basicSalary){
        super(basicSalary, id, name);
    }

    double calculateTotalSalarya(){
        double HRA = 0.20* BasicSalary;
        double DA = 0.10* BasicSalary;

        System.out.println("Salary After House Rent Allowance :" + HRA);
        System.out.println("Salary After Dearness Allowance : "+  DA);

        return BasicSalary + HRA + DA;
    }

    void DispalyDetails(){
        System.out.println("Employee ID: " + personID);
        System.out.println("Employee Name : "+ personName);
        System.out.println("Basic Salary :" + BasicSalary);
        System.out.println("Total Salary :" + calculateTotalSalarya());
        
    }
}
