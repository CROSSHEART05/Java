import java.util.*;

class strong {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number to be checked :");
        int n = sc.nextInt();
        int temp;
        int strong = 0;
        int copy = n;

        while (n > 0) {
            temp = n % 10;
            int x = fact(temp);
            strong += x;
            n /= 10;
        }
        System.out.println("Strong number =" + strong);

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
            // System.out.println(f);
        }

        return f;
    }
}
