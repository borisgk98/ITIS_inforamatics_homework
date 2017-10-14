import java.lang.reflect.Array;
import java.util.*;

class Task28 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next(), b = scan.next();
        System.out.println(stringCompare(a, b));
    }

    public static byte stringCompare(String a, String b) {
        for (int i = 0; i < a.length(); i++) {
            if (i >= b.length()) {
                return 1;
            }
            if (a.charAt(i) < b.charAt(i)) {
                return -1;
            }
            if (a.charAt(i) > b.charAt(i)) {
                return 1;
            }
        }
        if (b.length() > a.length()) {
            return -1;
        }
        return 0;
    }
}
