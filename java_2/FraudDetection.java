/*
    Fraud Detection using transaction data .

    Problem Statement:

    You are working as a software developer in a fintech company that processes thousands of transactions daily.
    Each transaction is stored in an integer array called nums.
    To detect transaction fraud the system needs to identify exactly two distinct transactions such that sum equal to
    a specific target value.

    Your task is to return the indices of those two transactions in the array that add up to the target value.

    Conditions:
    1. Each input will have exactly one solution.
    2. You may not use the same transaction twice.
    3. You can return the answer in any order.
    4. The array may contain negative numbers or duplicate amount.

    Example 1:
    Input: nums = [2,7,11,15], target = 9
    Output: [0,1]
*/
package java_2;

import java.util.*;

class FraudDetection {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();

        System.out.print("Enter the target sum : ");
        int target = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements of the array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("The target sum is: " + target);
        boolean found = false;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == target) {
                    found = true;
                    System.out.println("Indices of the transactions are: [" + i + ", " + j + "]");
                }
            }
        }

        if(found) {
            System.out.println("Pair with the given target sum " + target + " is found in the array.");
        } else {
            System.out.println("No pair with the given target sum " + target + " is found in the array.");
        }
        sc.close();
    }
}
