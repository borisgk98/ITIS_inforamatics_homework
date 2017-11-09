package ru.kpfu.itis.g11704.borisgk98.task60

import java.lang.*;
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // 10 8 9 7 8 6 7 5 6 4 5 3 4 2 3 2 3 2 3 2 3 ...
        int n = scan.nextInt();
        if (n < 1) {
            System.out.println("Bad args");
        }
        else if (n % 2 == 0) {
            if (n < 14) {
                System.out.println(9 - n / 2);
            }
            else {
                System.out.println(2);
            }
        }
        else {
            if (n < 14) {
                System.out.println(10 - n / 2);
            }
            else {
                System.out.println(3);
            }
        }
    }
}