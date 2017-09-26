import java.util.Scanner;
import java.lang.Math;
import java.math.*;

public class Task6 {
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
			BigDecimal rez = new BigDecimal(0f);
			rez.setScale(10, BigDecimal.ROUND_DOWN);
			for (int m = 1; m <= n; m++) {
				BigDecimal nextNum = new BigDecimal(1);
				nextNum.setScale(10, BigDecimal.ROUND_DOWN);
				for (int i = 2; i < m; i++) {
					nextNum = nextNum.multiply(new BigDecimal(i));
				}
				for (int i = m; i <= 2 * m; i++) {
					nextNum = nextNum.divide(new BigDecimal(i), 10, BigDecimal.ROUND_DOWN);
				}
				rez = rez.add(nextNum);
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