import java.util.Scanner;

class Arm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N = ");
        int n = sc.nextInt();
        sc.close();

        int l = (n + "").length();
        int t = n;
        int sum = 0;
        while (t > 0) {
            int d = t % 10;
            t /= 10;
            sum += Math.pow(d, l);
        }
        if (sum == n)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}