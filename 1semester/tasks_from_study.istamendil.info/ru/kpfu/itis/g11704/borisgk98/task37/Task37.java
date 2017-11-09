package ru.kpfu.itis.g11704.borisgk98.task37

import java.lang.reflect.Array;
import java.util.*;

class Task37 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(), m = scan.nextInt(), scale = scan.nextInt();
        final double eps = 1e-1;
        for (int y = m; y >= 0; y--) {
            System.out.printf("%04d.%02d", y / scale, y * 100 / scale % 100);
            for (int x = 0; x <= n; x++) {
                int fX = Math.round(Math.round(scale * Math.sin((double) x / scale)) + scale * 10);
                if (y == fX) {
                    if (Math.abs(dirF((double) x / scale)) < eps) {
                        System.out.print(fX > scale * 10 ? '\'' : ',');
                    }
                    else if (dirF((double) x / scale) < eps) {
                        System.out.print('\\');
                    }
                    else {
                        System.out.print('/');
                    }
                } else {
                    System.out.print(' ');
                }
            }
            System.out.println();
        }
    }
    static double dirF(double x) {
        return Math.cos(x);
    }
}
