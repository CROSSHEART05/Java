import java.util.Scanner;

public class MatrixEquality {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get the dimensions of the matrices
        System.out.println("Enter the number of rows in the first matrix: ");
        int rows1 = sc.nextInt();
        System.out.println("Enter the number of columns in the first matrix: ");
        int cols1 = sc.nextInt();

        System.out.println("Enter the number of rows in the second matrix: ");
        int rows2 = sc.nextInt();
        System.out.println("Enter the number of columns in the second matrix: ");
        int cols2 = sc.nextInt();

        // Check if the matrices have the same dimensions
        if (rows1 != rows2 || cols1 != cols2) {
            System.out.println("The matrices are not equal.");
            return;
        }

        // Create two matrices to store the input values
        int[][] matrix1 = new int[rows1][cols1];
        int[][] matrix2 = new int[rows2][cols2];

        // Get the input values for the first matrix
        System.out.println("Enter the elements of the first matrix: ");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                matrix1[i][j] = sc.nextInt();
            }
        }

        // Get the input values for the second matrix
        System.out.println("Enter the elements of the second matrix: ");
        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < cols2; j++) {
                matrix2[i][j] = sc.nextInt();
            }
        }

        // Check if the matrices are equal
        boolean isEqual = true;
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                if (matrix1[i][j] != matrix2[i][j]) {
                    isEqual = false;
                    break;
                }
            }
        }

        // Display the result
        if (isEqual) {
            System.out.println("The matrices are equal.");
        } else {
            System.out.println("The matrices are not equal.");
        }

        // Display both matrices
        System.out.println("The first matrix is: ");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                System.out.print(matrix1[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("The second matrix is: ");
        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < cols2; j++) {
                System.out.print(matrix2[i][j] + " ");
            }
            System.out.println();
        }
    }
}