/*

2. Create an Employee class that inherits from the Person class and includes:
        o Basic Salary

*/

package java_2;

import java.util.*;

public class Employee extends Person {
    double BasicSalary;

    Employee(double basicSalary, int id, String name){
        super(id,name);
        this.BasicSalary = basicSalary;
    }
    
}
