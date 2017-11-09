package ru.kpfu.itis.g11704.borisgk98.task51

import java.lang.*;
import java.math.BigInteger;
import java.util.*;

class Task51 {
    public static void main(String[] args) {
        final int MAX_ARR_SIZE = 10;
        Random rand = new Random();
        int n = MAX_ARR_SIZE;
        ArrayList<BigInteger> arr = new ArrayList<BigInteger>();
        StringBuilder strNum = new StringBuilder();
        strNum.append(rand.nextInt());
        arr.add(new BigInteger(strNum.toString()));
        for (int i = 1; i < n; i++) {
            arr.add(arr.get(i-1).pow(2));
        }
        for (BigInteger el : arr) {
            System.out.print(el + " ");
        }
        System.out.println();
        Collections.reverse(arr);
        for (BigInteger el : arr) {
            System.out.print(el + " ");
        }
        System.out.println();
    }
}