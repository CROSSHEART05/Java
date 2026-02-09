import java.util.Arrays;
import java.util.Scanner;

public class BouncyNum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER A NUMBER: ");
        int num = sc.nextInt();
        sc.close();

        String[] org = (num + "").split("");
        String[] asc = (num + "").split("");

        Arrays.sort(asc);

        String[] dsc = new String[asc.length];
        for (int i = 0; i < asc.length; i++) {
            dsc[i] = asc[asc.length - 1 - i];
        }

        if (!Arrays.equals(org, asc) && !Arrays.equals(org, dsc))
            System.out.println("It is a bouncy number");
        else
            System.out.println("It is NOT a bouncy number");
    }
}
