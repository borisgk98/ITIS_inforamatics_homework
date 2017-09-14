import java.util.Scanner;
import java.lang.Math;

public class Task2 {
	public static void main(String[] args) {
		try {
			double radius = Double.parseDouble(args[0]);
			System.out.printf("Circule length: %f\nCircule square: %f\n", radius * Math.PI * 2,
			 radius * radius * Math.PI);
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