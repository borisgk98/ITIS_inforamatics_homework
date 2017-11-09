package ru.kpfu.itis.g11704.borisgk98.task18

import java.util.Scanner;
import java.math.*;

public class Task18 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt(), k = scan.nextInt();
		String rez = "";
		long sum = 0;
		while(a != 0) {
			int p = a % k;
			rez = (char)(p > 9 ? p + 'A' - 10 : p + '0') + rez;
			sum += p;
			a /= k;
		}
		System.out.println(rez);
		System.out.println(sum);
	}
}