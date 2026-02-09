package java_2;

import java.util.*;

class random {
    public static void main(String[] args) throws InterruptedException {

        // Date d = new Date();
        // System.out.println(d);
        // System.out.println(d.getTime());

        // long n = d.getTime();
        // long a = n % 100;
        // System.out.println("Random Number : " + a);y

        System.out.print("Your OTP is : ");
        for (int i = 0; i < 6; i++) {
            Date d = new Date();
            long n = d.getTime();
            long a = n % 10;
            System.out.print(a + "");
            Thread.sleep(1);
        }
    }
}