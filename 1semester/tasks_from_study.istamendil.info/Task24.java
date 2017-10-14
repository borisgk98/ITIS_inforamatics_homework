import java.lang.reflect.Array;
import java.util.*;

public class Task24 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int d = scan.nextInt();
        final double eps = 0.2;
        for (int x = 0; x <= d; x++) {
            for (int y = 0; y <= d; y++) {
                if (sqr((double)x - d / 2) + sqr((double)y - d / 2) <= sqr((double)d / 2 + eps))
                    System.out.print("*");
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static double sqr(double a) {
        return a * a;
    }

}
