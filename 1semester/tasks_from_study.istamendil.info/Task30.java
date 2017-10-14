import java.lang.reflect.Array;
import java.util.*;

class Task30 {
    static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        System.out.println(isPalindrome(s));
    }

    static boolean isPalindrome(String a) {
        for (int i = 0; i < a.length() / 2; i++) {
            if (a.charAt(i) != a.charAt(a.length() - i - 1)){
                return false;
            }
        }
        return true;
    }
}
