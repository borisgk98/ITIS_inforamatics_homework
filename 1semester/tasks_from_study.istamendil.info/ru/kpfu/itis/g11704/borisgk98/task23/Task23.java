package ru.kpfu.itis.g11704.borisgk98.task23

public class Task23 {
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
			if (n % 2 != 1) {
				System.err.println("Bad arguments");
				System.exit(1);
			}
			for (int i = 1; i <= n; i += 2) {
				printOneStr(i, n);
			}
			System.exit(0);
		}
		finally {
			System.err.println("Unknown error");
			System.exit(1);
		}
	}

	static void printNChar(int n, char ch) {
		for (int i = 0; i < n; i++) {
			System.out.print(ch);
		}
	}

	static void printOneStr(int k, int n) {
			printNChar(n / 2 - k / 2, ' ');
			printNChar(k, '*');
			printNChar(n / 2 - k / 2, ' ');
			System.out.println();
	}
}