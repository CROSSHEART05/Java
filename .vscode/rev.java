import java.util.*;

class rev {
    public static void main(String[] args) {

        Scanner Sc = new Scanner(System.in);

        System.out.println("Enter a number ");

        int num = Sc.nextInt();
        int rev = 0;

        while (num > 0) {
            int d = num % 10;
            num = num / 10;
            rev = rev * 10 + d;
            System.out.println("Reversed num " + rev);
        }

    }
}