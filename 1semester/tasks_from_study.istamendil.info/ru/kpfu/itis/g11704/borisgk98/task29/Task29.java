package ru.kpfu.itis.g11704.borisgk98.task29

import java.lang.reflect.Array;
import java.util.*;

class Task29 {
    static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s1 = scan.next(), s2 = scan.next();
        System.out.println(findSubstring(s1, s2));
    }

    // speed by time O(n)
    // return index or -1 if not found
    static int findSubstring(String string, String subString) {
        String a = new String(subString + "\n" + string);
        int[] prefF = new int[a.length()];
        for (int i = 1; i < prefF.length; i++) {
            int c = prefF[i - 1];
            while (c != 0 && a.charAt(c) != a.charAt(i)) {
                c = prefF[c];
            }
            if (c == 0) {
                prefF[i] = (a.charAt(i) == a.charAt(c) ? 1 : 0);
            }
            else {
                prefF[i] = c + 1;
            }
            if (prefF[i] == subString.length())
                return i - 2 * subString.length();
        }
        return -1;
    }
}
