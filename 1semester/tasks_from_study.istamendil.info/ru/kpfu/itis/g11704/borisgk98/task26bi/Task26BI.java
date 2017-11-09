package ru.kpfu.itis.g11704.borisgk98.task26bi

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
			BigInteger[] v = new BigInteger[n + 1];
			v[0] = BigInteger.ONE;
			for (int i = 0; i <= n; i++) {
				for (int j = 0; j < n - i; j++) {
					for (int k = 0; k < formatK; k++) {
						System.out.print(' ');
					}
				}
				for (int j = 0; j < i + 1; j++) {
					String s = v[i].toString();
					for (int k = 0; k < s.length - formatK; k++) {
						System.out.print(' ');
					}
					System.out.print(s);
				}                
				System.out.println();
				if (i + 2 >= n + 1) {
					break;
				}
				for (int j = i + 2; j > 0; j--) {
					v[j] = v[j].muliply(v[j - 1]);
				}
			}
			System.exit(0);
		}
		finally {
			System.err.println("Unknown error");
			System.exit(1);
		}
	}

	static BigInteger factorial(BigInteger n) {
		BigInteger r = new BigInteger(n);
		for (BigInteger i = BigInteger.ONE; i.equals(n) != true; i = i.add(BigInteger.ONE)) {
			r = r.multiply(i);
		}
		return r;
	}

	static BigInteger combination(BigInteger n, BigInteger k) {
		return factorial(n) / factorial(k) / factorial(n - k );
	}

	static char[] format(String a, int k) {
		char[] charr = new char[k];
		for (int i = 0; i < a.length - k; i++) {
			char
		}
		return charr;
	}
}