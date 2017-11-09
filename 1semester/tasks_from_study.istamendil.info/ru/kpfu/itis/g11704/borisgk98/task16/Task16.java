package ru.kpfu.itis.g11704.borisgk98.task16

import java.util.Scanner;
import java.math.*;

public class Task16 {
	public static void main(String[] args) {
		try {
			if (args.length < 1) {
				System.err.println("No mush arguments");
				System.exit(1);
			}
			int a = 0;
			try {
				a = Integer.parseInt(args[0]);
			}
			catch (java.lang.NumberFormatException exp) {
				System.err.println("Bad arguments");
				System.exit(1);
			}
			int numOf1 = 0;
			for (int i = 31; i >= 0; i--) {
				int rez = ((a & (1 << i)) == 0 ? 0 : 1);
				System.out.print(rez);
				numOf1 += rez;
			}
			System.out.format("\n%d\n", numOf1);
			System.exit(0);
		}
		finally {
			System.err.println("Unknown error");
			System.exit(1);
		}
	}
}