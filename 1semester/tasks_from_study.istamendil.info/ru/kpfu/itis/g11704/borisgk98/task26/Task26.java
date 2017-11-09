package ru.kpfu.itis.g11704.borisgk98.task26

import java.math.*;

public class Task26 {

	public static void main(String[] args) {
		try {
			if (args.length < 1) {
				System.err.println("No mush arguments");
				System.exit(1);
			}
			int n = 0;	
		try {
				n = Integer.parseInt(args[0]);
			}
			catch (java.lang.NumberFormatException exp) {
				System.err.println("Bad arguments");
				System.exit(1);
			}
			long maxNum = combination(n, n / 2);
			System.out.println(maxNum);
			int formatK = 0;
			while (maxNum != 0) {
				formatK++;
				maxNum /= 10;
			}
			int[] v = new int[n + 1];
			v[0] = 1;
			for (int i = 0; i <= n; i++) {
				for (int j = 0; j < n - i; j++) {
					System.out.print(format(0, formatK));
				}
				for (int j = 0; j < i + 1; j++) {
					System.out.print(format(v[j], formatK));
					System.out.print(format(0, formatK));
				}                
				System.out.println();
				if (i + 2 >= n + 1) {
					break;
				}
				for (int j = i + 2; j > 0; j--) {
					v[j] = v[j] + v[j - 1];
				}
			}
			System.exit(0);
		}
		finally {
			System.err.println("Unknown error");
			System.exit(1);
		}
	}

	static long factorial(long n) {
		long r = 1;
		for (int i = 2; i <= n; i++) {
			r *= i;
		}
		return r;
	}

	static long combination(long n, long k) {
		return factorial(n) / factorial(k) / factorial(n - k );
	}

	static char[] format(int a, int k) {
		char[] charr = new char[k];
		for (int i = 0; i < k; i++) {
			charr[i] = ' ';		
		}
		int poz = k - 1;
		while (a != 0 && poz >= 0) {
			charr[poz] = (char)(a%10 + '0');
			a /= 10;
			poz--;
		}
		return charr;
	}
}