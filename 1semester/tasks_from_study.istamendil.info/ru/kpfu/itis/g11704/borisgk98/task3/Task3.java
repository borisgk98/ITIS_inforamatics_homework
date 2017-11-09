package ru.kpfu.itis.g11704.borisgk98.task3

import java.util.Scanner;
import java.lang.Math;

public class Task3 {
	public static void main(String[] args) {
		try {
			long n = Long.parseLong(args[0]);
			double calculatedPI = 2;
			for (long i = 1; i <= n; i++) {
				calculatedPI *= 4 * (double)(i * i) / (2 * (double)(i) - 1) / (2 * (double)(i) + 1);
			}
			System.out.printf("calculatedPI = %f\nMath.PI = %f\n", calculatedPI, Math.PI);
			System.exit(0);
		}
		catch (java.lang.ArrayIndexOutOfBoundsException exc) {
			System.err.println("Not enought arguments");
			System.exit(1);			
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