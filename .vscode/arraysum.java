import java.util.*;

public class arraysum {
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
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(n[i][j] + " ");

            }
            System.out.println();
        }
        int suml = 0;
        int sumr = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (i == j)
                    suml = suml + n[i][j];
                if (i + j == 3)
                    sumr = sumr + n[i][j];
            }
        }
        System.out.println("Sum of the diagoanls ");
        System.out.println("Sum of the left diagonal " + suml);
        System.out.println("Sum of the right diagonal " + sumr);
    }
}