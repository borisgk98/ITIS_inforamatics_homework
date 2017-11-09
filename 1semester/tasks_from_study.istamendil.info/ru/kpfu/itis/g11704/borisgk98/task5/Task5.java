package ru.kpfu.itis.g11704.borisgk98.task5

import java.util.Scanner;
import java.lang.Math;

public class Task5 {
	public static void main(String[] args) {
		try {
			if (args.length < 2) {
				System.err.println("Not enought arguments");
				System.exit(1);		
			}
			int n = Integer.parseInt(args[0]);
			double x = Double.parseDouble(args[1]);
			double newValue = x / ((double)(n) + 1);
			for (int i = 1; i < n; i++) {
				newValue = x / ((double)(n - i + 1) + newValue);
			}
			System.out.format("Result: %.5f\n", newValue + 1);
			System.exit(0);
		}
		catch (java.lang.NumberFormatException exc) {
			System.err.println("Bad arguments");
			System.exit(1);
		}
		finally {
			System.err.println("Unknown error");
			System.exit(1);
		}
	}
}