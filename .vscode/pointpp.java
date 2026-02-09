import java.util.*;

/**
 * point
 */
public class pointpp {

    int x;
    int y;

    public void Point() {
        x = 0;
        y = 0;

    }

    void read() {
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        y = sc.nextInt();
    }

    public void MidPoint(int A, int B) {
        x = (A * x + B * x) / 2;
        y = (A * y + B * y) / 2;
    }

    public void display() {
        System.out.println(x);
        System.out.println(y);

    }

    public static void main(String[] args) {
        Point obj = new Point();
        obj.read();
        obj.MidPoint();
        obj.dispaly();

    }
}