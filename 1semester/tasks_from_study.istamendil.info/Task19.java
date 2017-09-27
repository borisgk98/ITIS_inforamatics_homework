import java.util.Scanner;
import java.math.*;

public class Task19 {
	public static void main(String[] args) {
		try {
			if (args.length < 1) {
				System.err.println("No mush arguments");
				System.exit(1);
			}
			int a = 0;
			try {
				a = Integer.parseInt(args[0]);
			}
			catch (java.lang.NumberFormatException exp) {
				System.err.println("Bad arguments");
				System.exit(1);
			}
			int maxNumOf1 = 0, prefNum = 0, numOf1 = 0;
			while (a != 0) {
				if ((a & 1) == 1) {
					prefNum = 1;
					numOf1++;
					maxNumOf1 = (maxNumOf1 > numOf1 ? maxNumOf1 : numOf1);
				}
				else {
					numOf1 = 0;
				}
				a >>>= 1;
			}
			System.out.format("%d\n", maxNumOf1);
			System.exit(0);
		}
		finally {
			System.err.println("Unknown error");
			System.exit(1);
		}
	}
}