package ru.kpfu.itis.g11704.borisgk98.task8

import java.util.Scanner;
import java.math.*;

public class Task8 {
	public static void main(String[] args) {
		try {
			if (args.length < 2) {
				System.err.println("No mush arguments");
				System.exit(1);
			}
			int n = 0;
			double x = 0;
			try {
				n = Integer.parseInt(args[0]);
				x = Double.parseDouble(args[1]);
			}
			catch (java.lang.NumberFormatException exp) {
				System.err.println("Bad arguments");
				System.exit(1);
			}	
			double rez = Math.cos(x);
			for (int i = 1; i < n; i++) {
				rez = Math.cos(x + rez);
			}
			System.out.format("%f\n", rez);
			System.exit(0);
		}
		finally {
			System.err.println("Unknown error");
			System.exit(1);
		}
	}
}