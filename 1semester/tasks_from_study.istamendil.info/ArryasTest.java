import java.util.*;

public class ArraysTest  {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] v = new int[n];
        Arrays.fill(v, 5);
        for (int el : v)
            System.out.print(el + " ");
        for (int i = 0; i < n; i++)
            v[i] = scan.nextInt();
        System.out.println();
        Arrays.sort(v);
        for (int el : v)
            System.out.print(el + " ");
        System.out.println();
        int[] v2 = new int[n];
        System.arraycopy(v, 0, v2, 0, n);
        for (int el : v)
            System.out.print(el + " ");
        System.out.println();
        System.out.println(v2.equals(v));
        System.out.println(Arrays.equals(v, v2));
        int a = Arrays.binarySearch(v, 3);
        System.out.println(a);

    }
}
