import java.util.Scanner;
import java.math.*;

public class Task14 {
	public static void main(String[] args) {
		try {
			if (args.length < 1) {
				System.err.println("No mush arguments");
				System.exit(1);
			}
			BigInteger n = BigInteger.ZERO, rez = BigInteger.ONE;
			try {
				n = n.add(BigInteger.valueOf(Integer.parseInt(args[0])));
			}
			catch (java.lang.NumberFormatException exp) {
				System.err.println("Bad arguments");
				System.exit(1);
			}
			while (n.compareTo(BigInteger.ONE) != 0) {
				rez = rez.multiply(n);
				n = n.subtract(BigInteger.ONE);
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