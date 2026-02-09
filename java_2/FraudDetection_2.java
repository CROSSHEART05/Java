package java_2;

import java.util.*;

class check{
    void check (int []arr, int target, int n, boolean found){
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == target) {
                    found = true;
                    System.out.println("Indices of the transactions are: [" + i + ", " + j + "]");
                }
            }
        }

    }
}

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

        // for (int i = 0; i < n; i++) {
        //     for (int j = i + 1; j < n; j++) {
        //         if (arr[i] + arr[j] == target) {
        //             found = true;
        //             System.out.println("Indices of the transactions are: [" + i + ", " + j + "]");
        //         }
        //     }
        // }

        if(found) {
            System.out.println("Pair with the given target sum " + target + " is found in the array.");
        } else {
            System.out.println("No pair with the given target sum " + target + " is found in the array.");
        }
        sc.close();
    }
}
