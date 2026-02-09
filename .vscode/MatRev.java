import java.util.Scanner;

public class MatRev {
    int arr[][], m, n;
    static Scanner sc = new Scanner(System.in);

    MatRev(int mm, int nn) {
        m = mm;
        n = nn;
        arr = new int[m][n];
    }

    void fillarray() {
        System.out.println("ENTER ELEMENTS:-");
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                arr[i][j] = sc.nextInt();
    }

    int reverse(int x) {
        int rev = 0;
        while (x > 0) {
            rev = rev * 10 + x % 10;
            x /= 10;
        }
        return rev;
    }

    void revMat(MatRev P) {
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                this.arr[i][j] = reverse(arr[i][j]);
    }

    void show() {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(arr[i][j] + "\t");
            System.out.println();
        }
    }

    public static void main(String args[]) {
        System.out.print("Enter no. of rows: ");
        int x = sc.nextInt();
        System.out.print("Enter no. of Columns: ");
        int y = sc.nextInt();
        MatRev obj = new MatRev(x, y);
        obj.fillarray();
        obj.revMat(obj);
        obj.show();
    }
}