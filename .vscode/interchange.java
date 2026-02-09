import java.util.Scanner;

public class interchange {
    public static void main(String[] args) {
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
        System.out.println("The original matrix");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(n[i][j] + " ");

            }
            System.out.println();
        }
        System.out.println("Matrix of the interchanged array ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int t = n[i][j];
                n[i][j] = n[i][cols - i - 1];
                n[i][cols - i - 1] = t;
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(n[i][j] + " ");
            }
            System.out.println();
        }
    }
}
