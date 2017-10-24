import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] v = new int[args.length];
        for (int i = 0; i < v.length; i++) {
            try {
                v[i] = Integer.parseInt(args[i]);
            }
            catch (java.lang.NumberFormatException exc) {
                System.err.println("Bad arguments");
                System.exit(1);
            }
        }
        toPrefSqrStr(v);
        System.out.println(toPrefSqrStr(v));
    }

    public static String toPrefSqrStr(int[] v) {
        int[] rez = new int[v.length];
        rez[0] = 0;
        for (int i = 1; i < rez.length; i++) {
            rez[i] = v[i - 1] * v[i - 1];
        }
        StringBuilder strB = new StringBuilder();
        for (int i = 0; i < rez.length; i++) {
            strB.append(rez[i]);
            strB.append(' ');
        }
        return strB.toString();
    }
}
