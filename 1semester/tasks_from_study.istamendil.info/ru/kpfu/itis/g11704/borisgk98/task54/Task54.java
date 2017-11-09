package ru.kpfu.itis.g11704.borisgk98.task54

import java.lang.*;
import java.util.*;
import java.io.File;

class Main {
    public static void main(String[] args) throws java.io.FileNotFoundException {
        Scanner scan;
        File file = new File("input.txt");
        scan = new Scanner(file);
        int n = scan.nextInt();
        System.out.println(fibRecursion(n));
        System.out.println(fibFor(n));
    }

    public static int fibRecursion(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("BadArgumentException exception");
        }
        if (n < 3) {
            return 1;
        }
        return fibRecursion(n - 1) + fibRecursion(n - 2);
    }

    public static int fibFor(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("BadArgumentException exception");
        }
        int a = 1, b = 1;
        for (int i = 3; i <= n; i++) {
            b = a + b;
            a = b - a;
        }
        return b;
    }
}