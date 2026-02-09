import java.util.Scanner;

public class Evil {
    private int nnum;
    private int rev;

    // Default constructor
    public Evil() {
        nnum = 0;
        rev = 0;
    }

    // Method to accept a positive integer number
    public void acceptNum() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer number: ");
        nnum = scanner.nextInt();

    }

    public void rec_bin(int x) {
        if (x > 0) {
            int d = x % 2;
            rev = rev * 10 + d;
            rec_bin(x / 2);

        }
    }
}