import java.util.Scanner;
import java.lang.Math;
import java.math.*;

public class Task6 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.printf("Please, enter n: ");
		int n = scan.nextInt();
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
	}
}