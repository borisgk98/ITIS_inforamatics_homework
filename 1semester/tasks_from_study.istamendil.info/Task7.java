import java.util.Scanner;
import java.lang.Math;
import java.math.*;

public class Task7 {
	public static void main(String[] args) {
		try {
			if (args.length < 1) {
				System.err.println("No mush arguments");
				System.exit(1);
			}
			long n = 0;
			try {
				n = Long.parseLong(args[0]);
			}
			catch (java.lang.NumberFormatException exp) {
				System.err.println("Bad arguments");
				System.exit(1);
			}	
			double rez = 1;
			for (double i = 1; i < n; i++) {
				rez += (i % 2 == 0 ? 1 : -1) / (2 * i + 1) / (2 * i + 1);
			}
			System.out.println(rez);
			System.exit(0);
		}
		finally {
			System.err.println("Unknown error");
			System.exit(1);
		}
	}
}