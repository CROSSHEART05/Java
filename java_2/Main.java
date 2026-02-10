package java_2;

import java.util.*;

class Consumer {
    int consumerID;
    String consumerName;
    int unitsConsumed;

    // Constructor
    Consumer(int id, String name, int units) {
        this.consumerID = id;
        this.consumerName = name;
        this.unitsConsumed = units;
    }
}


class ElectricityBill extends Consumer {
    // Constructor
    ElectricityBill(int id, String name, int units) {
        super(id, name, units);
    }

    // Method to calculate bill amount
    double calculateBill() {
        double billAmount = 0;
        if (unitsConsumed <= 100) {
            billAmount = unitsConsumed * 1.50;
        } else if (unitsConsumed <= 300) {
            billAmount = 100 * 1.50 + (unitsConsumed - 100) * 2.50;
        } else {
            billAmount = 100 * 1.50 + 200 * 2.50 + (unitsConsumed - 300) * 4.00;
        }
        return billAmount;
    }

    void displayDetails() {
        System.out.println("Consumer ID: " + consumerID);
        System.out.println("Consumer Name: " + consumerName);
        System.out.println("Units Consumed: " + unitsConsumed);
        System.out.println("Total Bill Amount:" + calculateBill());
    }   
    
    
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Consumer ID: ");
        int id = sc.nextInt();

        sc.nextLine(); // consume leftover newline

        System.out.print("Enter Consumer Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Units Consumed: ");
        int units = sc.nextInt();

        ElectricityBill bill = new ElectricityBill(id, name, units);
        bill.displayDetails();

        sc.close();
    }
}
