import java.util.Scanner;
import java.math.*;

public class Task13 {

	public static void main(String[] args) {
		try {
			if (args.length < 2) {
				System.err.println("No mush arguments");
				System.exit(1);
			}
			int x = 0, y = 0;
			try {
				x = Integer.parseInt(args[0]);
				y = Integer.parseInt(args[1]);
			}
			catch (java.lang.NumberFormatException exp) {
				System.err.println("Bad arguments");
				System.exit(1);
			}
			x *= y;
			y = x / y;
			x = x / y;
			System.out.format("%d %d\n", x, y);
			System.exit(0);
		}
		finally {
			System.err.println("Unknown error");
			System.exit(1);
		}
	}
}