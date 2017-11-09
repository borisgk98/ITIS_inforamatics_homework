package ru.kpfu.itis.g11704.borisgk98.task49

import java.lang.*;
import java.util.*;

class Task49 {
    public static void main(String[] args) {
        final int MAX_ARR_SIZE = 30;
        Random rand = new Random();
        int n = Math.abs(rand.nextInt()) % MAX_ARR_SIZE;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = rand.nextInt();
        }
        for (int el : arr) {
            System.out.print(el + " ");
        }
        System.out.println();
        for (int i = 0; i < n / 2; i++) {
            int c = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = c;
        }
        for (int el : arr) {
            System.out.print(el + " ");
        }
        System.out.println();
    }
}