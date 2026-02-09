import java.util.*;

public class hadamard {
    public static void filllaray() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no. of rows");
        int rows = sc.nextInt();

        System.out.println("Enter the numbers of the columns");
        int cols = sc.nextInt();

        int n[][] = new int[rows][cols];

        // input

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                n[i][j] = sc.nextInt();
            }
        }

        // output
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(n[i][j] + " ");

            }
            System.out.println();
        }
        public static void transpose();{

        }

    }
}