/* P.S. --> A bank wants to develop a prg too manage its customer accounts and perform basic transactions 

    Requirements:
    1. Create a class BankAccount with attributes :
            AccountNumber, 
            AcountHolderName, 
            Balance

    2. Implement methods to:
        a. deposit(amount): Add amount to balance
        b. withdraw(amount): Subtract amount from balance if sufficient funds are available
        c. getBalance(): Return the current balance
        
    3. Create a bankApp class with a main method to perfrom transaction and display balance.

*/
package java_2;

import java.util.*;

class BankAccount {
    long Account_Number;
    String AccountHolderName;
    float Balance;

    // Constructor
    BankAccount(long accNum, String accHolderName, float initialBalance) {
        this.Account_Number = accNum;
        this.AccountHolderName = accHolderName;
        this.Balance = initialBalance;
    }

    // Method to deposit amount
    void deposit(float amount) {
        if (amount > 0) {
            Balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Method to withdraw amount
    void withdraw(float amount) {
        if (amount > 0 && amount <= Balance) {
            Balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient funds or invalid amount."

            );
        }
    }

    float getBalance() {
        return Balance;
    }
}

class BankApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Account Number : ");
        long accNum = sc.nextLong();

        sc.nextLine();

        System.out.print("Enter  Account Holder Name : ");
        String accHolderName = sc.nextLine();

        System.out.print("Enter Initial balance : ");
        float initialBalance = sc.nextFloat();

        BankAccount acc1 = new BankAccount(accNum, accHolderName, initialBalance);

        // System.out.println("Initial Balance : " + acc1.getBalance());
        // System.out.println("Enter amount to deposit : ");
        // float depositAmount = sc.nextFloat();

        int choice;
        do {
            System.out.print("\n\n-----Menu-----\n");
            System.out.print("1. Deposit\n");
            System.out.print("2.Withdraw \n");
            System.out.print("3.Check Balance \n");
            System.out.print("4.Exit \n");
            System.out.print("Enter your choice : ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit : ");
                    float depositAmount = sc.nextFloat();
                    acc1.deposit(depositAmount);
                    break;

                case 2:
                    System.out.print("Enter amount to withdraw : ");
                    float withdrawAmount = sc.nextFloat();
                    acc1.withdraw(withdrawAmount);
                    break;

                case 3:
                    System.out.print("Current Balance : " + acc1.getBalance());
                    break;

                case 4:
                    System.out.print("Exiting...");
                    break;

                default:
                    System.out.print("Invalid Choice");
            }
        } while (choice != 4);
        sc.close();
    }
}