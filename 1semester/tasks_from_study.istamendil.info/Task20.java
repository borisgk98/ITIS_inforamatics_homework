import java.util.*;
import java.lang.*;

public class Task20 {
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
			}
			for (int i = 1; i <= Math.floor(Math.sqrt((double)(n))); i++) {
				if (n % i == 0) {
					System.out.printf("%d %d ", i, n / i);
				}
			}
			System.exit(0);
		}
		finally {
			System.err.println("Unknown error");
			System.exit(1);
		}
	}
}