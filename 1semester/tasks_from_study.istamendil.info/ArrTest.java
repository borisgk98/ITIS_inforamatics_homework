import java.math.*;

public class ArrTest {

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
			if (n < 3) {
				System.err.println("Bad arguments");
				System.exit(1);
			}
			if (args.length < n  + 1) {
				System.err.println("No mush arguments");
				System.exit(1);
			}
			int[] v = new int[n];
			int p = 0;
			for (int i = 0; i < n; i++) {
				try {
					v[i] = Integer.parseInt(args[i + 1]);
					if (v[i] <= 0) {
						System.err.println("Bad arguments");
						System.exit(1);	
					}
				}
				catch (java.lang.NumberFormatException exp) {
					System.err.println("Bad arguments");
					System.exit(1);
				}
				p += v[i];
			}
			System.out.println(p);
			for (int el : v) {
				System.out.printf("%d ", el);
			}
			System.exit(0);
		}
		finally {
			System.err.println("Unknown error");
			System.exit(1);
		}
	}
}
