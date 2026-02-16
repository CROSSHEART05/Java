/*

Employee Salary Calculation Using Multilevel Inheritance

Problem Statement:
An organization wants to calculate the monthly salary of its employees using object-oriented
programming and multilevel inheritance.
Requirements
    1. Create a Person class with the following data members:
        o Person ID
        o Person Name

    2. Create an Employee class that inherits from the Person class and includes:
        o Basic Salary

    3. Create a Salary class that inherits from the Employee class and contains:
        o A method to calculate the total salary

    4. The total salary should be calculated using the following rules:
        o House Rent Allowance (HRA): 20% of Basic Salary
        o Dearness Allowance (DA): 10% of Basic Salary
        o Total Salary = Basic Salary + HRA + DA

    5. Display the employee details and the total salary.

*/

package java_2;
class Person{

    int personID;
    String personName;

    // Constructor
    Person(int id, String name){
        this.personID = id;
        this.personName = name;
    }
}

