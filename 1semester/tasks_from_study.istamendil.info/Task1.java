import java.util.Scanner;
import java.lang.*;

public class Task1 {
	public static void main(String[] args) {
		if (args.length < 1) {
			System.err.println("Not enought arguments");
			System.exit(1);
		}
		try {
			double timeOfFall = Double.parseDouble(args[0]);
			System.out.printf("Depth of the well: %fm\n", timeOfFall * timeOfFall * 0.5);
			int a = 5/0;
			System.exit(0);
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