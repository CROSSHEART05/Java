import java.util.*;

class array_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[] = new int[n];

        // Takes the input for the array

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i] = sc.nextInt();
                System.out.println(arr[i]);
            }
        }

        // Prints the array

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println(arr[i]);
            }
        }
    }
}