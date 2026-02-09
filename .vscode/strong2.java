import java.util.*;

class StrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to be checked: ");
        int n = sc.nextInt();

        int temp, strong = 0;
        int copy = n;

        while (n > 0) {
            temp = n % 10;
            strong += fact(temp);
            n /= 10;
        }

        if (strong == copy) {
            System.out.println(copy + " is a Strong Number.");
        } else {
            System.out.println(copy + " is not a Strong Number.");
        }
    }

    static int fact(int y) {
        int f = 1;
        for (int i = y; i > 0; i--) {
            f *= i;
        }
        return f;
    }
}
