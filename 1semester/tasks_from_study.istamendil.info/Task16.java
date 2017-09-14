import java.util.Scanner;
import java.math.*;

public class Task16 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt(), numOf1 = 0;
		while (a != 0) {
			System.out.print(a & 1);
			numOf1 += a & 1;
			a >>= 1;
		}
		System.out.format("\n%d\n", numOf1);
	}
}