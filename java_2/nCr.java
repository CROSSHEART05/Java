package java_2;

import java.util.*;

class nCr {
    int fact(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        nCr obj = new nCr();

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        System.out.print("Enter the value of r: ");
        int r = sc.nextInt();

        int ncr = obj.fact(n) / (obj.fact(r) * obj.fact(n - r));
        System.out.println("nCr of " + n + " and " + r + " is: " + ncr);
    }
}