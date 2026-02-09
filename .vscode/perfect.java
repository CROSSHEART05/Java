import java.util.*;

public class perfect {

    static int num;

    public static void Perfect(int nn) {

        int factorial = 1;
        for (int i = 1; i >= nn; i--) {

            factorial = factorial * i;
            System.out.println(factorial);
        }
    }

    public int Sum() {

        int sum = 0;
        int t = num;

        while (t > 0) {
            int d = t % 10;
            sum = sum + d;
            t = t / 10;
        }
        return sum;

    }

    public void main(String[] args) {

        Scanner Sc = new Scanner(System.in);
        System.out.println("enter a number");
        num = Sc.nextInt();
        int sum = Sum();
        Sc.close();
        if (sum == num)
            System.out.println("It is a Perfect number.");
        else
            System.out.println("It is noit a perfect number");

    }
}

// correct this