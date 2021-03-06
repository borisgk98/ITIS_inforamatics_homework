import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        char ch = scan.next().charAt(0);
        int[] rez = split(str, ch);
        System.out.println(toStr(split(str, ch)));
    }

    public static int[] split(String str, char ch) {
        return split(str.toCharArray(), ch);
    }

    public static int[] split(char[] str, char ch) {
        int arrSize = 1;
        for (int i = 0; i < str.length - 1; i++) {
            if (str[i] != ch && (str[i + 1] == ch || i == str.length - 2)) {
                arrSize++;
            }
        }
        int[] rez = new int[arrSize];
        int i = 0, iter = 0;
        while (true) {
            while (i < str.length && str[i] == ch) {
                i++;
            }
            if (i == str.length)
                break;
            int l = i, r = i;
            while (r < str.length && str[r] != ch) {
                r++;
            }
            StringBuilder strB = new StringBuilder();
            for (int j = r - 1; j >= l; j--) {
                if (str[j] < '0' || str[j] > '9') {
                    throw new java.lang.NumberFormatException();
                }
                strB.append(str[j]);
            }
            rez[iter] = toInt(strB.toString());
            iter++;
            i = r;
            if (i >= str.length) {
                break;
            }
        }
        return rez;
    }

    public static String toStr(int[] v) {
        StringBuilder sB = new StringBuilder();
        for (int el : v) {
            sB.append(el);
            sB.append(' ');
        }
        return sB.toString();
    }

    public static int toInt(String str) {
        int rez = 0, step = 1;
        for (int i = str.length() - 1; i >= 0; i--) {
            rez += step * (str.charAt(i) - '0');
            step *= 10;
        }
        return rez;
    }
}
