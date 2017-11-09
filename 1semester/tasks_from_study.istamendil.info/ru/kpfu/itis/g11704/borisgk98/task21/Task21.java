package ru.kpfu.itis.g11704.borisgk98.task21

import java.util.*;
import java.lang.*;

public class Task21 {
	public static void main(String[] args) {
		try {
			if (args.length < 2) {
				System.err.println("No mush arguments");
				System.exit(1);
			}
			int a = 0, b = 0;
			try {
				a = Integer.parseInt(args[0]);
				b = Integer.parseInt(args[1]);
			}
			catch (java.lang.NumberFormatException exp) {
				System.err.println("Bad arguments");
				System.exit(1);
			}
			System.out.println(lcd(a, b));
			System.exit(0);
		}
		finally {
			System.err.println("Unknown error");
			System.exit(1);
		}
	}

	static int lcd(int a, int b) {
		return a / gcd(a, b) * b;
	}

	static int gcd(int a, int b) {
		while (b != 0) {
			a %= b;
			int c = a;
			a = b;
			b = c;
		}
		return a;
	}
}