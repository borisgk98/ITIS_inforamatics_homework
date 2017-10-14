import java.lang.reflect.Array;
import java.util.*;

class Task27 {
    static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n1 = scan.nextInt(), n2 = scan.nextInt();
        int[] a = new int[n1], b = new int[n2];
        for (int i = 0; i < n1; i++) {
            a[i] = scan.nextInt();
        }
        for (int i = 0; i < n2; i++) {
            b[i] = scan.nextInt();
        }
        System.out.println(findArr(a, b));
    }

    // speed by time O(n)
    // return index or -1 if not found
    static int findArr(int[] arr, int[] subArr) {
        long[] a = new long[arr.length + subArr.length + 1];
        for (int i = 0; i < subArr.length; i++) {
            a[i] = subArr[i];
        }
        a[subArr.length] = Long.MIN_VALUE;
        for (int i = subArr.length + 1; i < a.length; i++) {
            a[i] = arr[i - subArr.length - 1];
        }
        int[] prefF = new int[arr.length + subArr.length + 1];
        for (int i = 1; i < prefF.length; i++) {
            int c = prefF[i - 1];
            while (c != 0 && a[c] != a[i]) {
                c = prefF[c];
            }
            if (c == 0) {
                prefF[i] = (a[i] == a[c] ? 1 : 0);
            }
            else {
                prefF[i] = c + 1;
            }
            if (prefF[i] == subArr.length)
                return i - 2 * subArr.length;
        }
        return -1;
    }
}
