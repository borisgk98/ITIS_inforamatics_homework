import java.lang.*;
import java.util.*;


class Task52 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int level = 0;
        String str = scan.next();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ')') {
                level--;
            }
            else if (str.charAt(i) == '(') {
                level++;
            }
            if (level < 0) {
                break;
            }
        }
        if (level < 0) {
            System.out.println("No a correct bracket sequence");
        }
        else {
            System.out.println("A correct bracket sequence");
        }
    }
}