import java.util.Scanner;

public class r_cSum {
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
        System.out.println("------------------------------");

        // SUM OF THE ROW
        for (int i = 0; i < rows; i++) {
            int sum = 0;
            for (int j = 0; j < cols; j++) {
                sum = sum + n[i][j];
            }
            System.out.println("The sum of the row   " + (i + 1) + "  is " + sum);
            System.out.println("----------------------------");
        }
        System.out.println("-------------------------------");

        // SUM OF THE COLUMN
        for (int i = 0; i < rows; i++) {
            int sum2 = 0;
            for (int j = 0; j < cols; j++) {
                sum2 = sum2 + n[j][i];
            }
            System.out.println("The sum of the column   " + (i + 1) + "  is " + sum2);
            System.out.println("----------------------------");
        }
        System.out.println("--------------------------");
    }
}
