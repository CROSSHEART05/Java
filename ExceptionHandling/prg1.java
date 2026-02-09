package ExeptionHandling;

import java.util.*;

class prg1 {

    public static void main(String[] args) {
        int[] numerator = { 10, 20, 30, 40, 50 };
        int[] denominator = { 2, 0, 5, 0, 10 };
        for (int i = 0; i < numerator.length; i++) {
            System.out.println(divide(numerator[i], denominator[i]));
        }
        System.out.println("Good one ....");
    }

    public static int divide(int num, int den) {
        return num / den;
    }
}