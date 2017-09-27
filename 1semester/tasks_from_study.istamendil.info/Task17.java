import java.util.Scanner;
import java.math.*;

public class Task17 {
	public static void main(String[] args) {
		try {
			if (args.length < 2) {
				System.err.println("No mush arguments");
				System.exit(1);
			}
			int a = 0, k = 0;
			try {
				a = Integer.parseInt(args[0]);
				k = Integer.parseInt(args[1]);
			}
			catch (java.lang.NumberFormatException exp) {
				System.err.println("Bad arguments");
				System.exit(1);
			}
			String rez = "";
			long sum = 0;
			while(a != 0) {
				int p = a % k;
				rez += (char)(p > 9 ? p + 'A' - 10 : p + '0');
				sum += p;
				a /= k;
			}
			System.out.println(new StringBuffer(rez).reverse());
			System.out.println(sum);
			System.exit(0);
		}
		finally {
			System.err.println("Unknown error");
			System.exit(1);
		}
	}
}