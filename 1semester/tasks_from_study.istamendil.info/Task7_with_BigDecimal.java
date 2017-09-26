import java.util.Scanner;
import java.lang.Math;
import java.math.*;

public class Task7_with_BigDecimal {
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
			BigDecimal rez = new BigDecimal(1f);
			rez.setScale(10, BigDecimal.ROUND_DOWN);
			for (long i = 1; i < n; i++) {
				rez = rez.add((new BigDecimal((i % 2 == 0 ? 1 : -1))).divide(
					(new BigDecimal(2 * i + 1)).multiply(
						new BigDecimal(
							2 * i + 1)),
					10, BigDecimal.ROUND_DOWN));
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