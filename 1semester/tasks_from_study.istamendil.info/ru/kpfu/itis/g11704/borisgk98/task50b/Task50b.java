package ru.kpfu.itis.g11704.borisgk98.task50b

import java.lang.*;
import java.util.*;

class Task50b {
    public static void main(String[] args) {
        final int MAX_ARR_SIZE = 30;
        Random rand = new Random();
        int n = Math.abs(rand.nextInt()) % MAX_ARR_SIZE;
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            arr.add(new Integer(rand.nextInt()));
        }
        for (int el : arr) {
            System.out.print(el + " ");
        }
        System.out.println();
        Collections.reverse(arr);
        for (int el : arr) {
            System.out.print(el + " ");
        }
        System.out.println();
    }
}