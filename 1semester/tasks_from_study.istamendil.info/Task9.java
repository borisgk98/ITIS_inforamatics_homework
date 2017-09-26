import java.util.Scanner;
import java.math.*;

public class Task9 {

	public static void main(String[] args) {
		try {
			if (args.length < 5) {
				System.err.println("No mush arguments");
				System.exit(1);
			}
			double x = 0, y = 0, r = 0, a = 0, b = 0;
			try {
				x = Double.parseDouble(args[0]);
				y = Double.parseDouble(args[1]);
				r = Double.parseDouble(args[0]);
				a = Double.parseDouble(args[0]);
				b = Double.parseDouble(args[0]);
			}
			catch (java.lang.NumberFormatException exp) {
				System.err.println("Bad arguments");
				System.exit(1);
			}	
			final double eps = 0.1e-6;
			System.out.println(sqr(x - a) + sqr(y - b) - sqr(r) < eps ? 
				"On the circle" : 
				"Outside the circle");
			System.exit(0);
		}
		finally {
			System.err.println("Unknown error");
			System.exit(1);
		}
	}

	static double sqr(double a) {
		return a * a;
	}
}