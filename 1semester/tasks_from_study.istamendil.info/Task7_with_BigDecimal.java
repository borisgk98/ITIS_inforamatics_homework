import java.util.Scanner;
import java.lang.Math;
import java.math.*;

public class Task7_with_BigDecimal {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.printf("Please, enter n: ");
		long n = scan.nextInt();
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
	}
}