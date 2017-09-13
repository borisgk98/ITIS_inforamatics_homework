import java.util.Scanner;
import java.lang.Math;

public class Task3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.printf("Please, enter nuber of multipliers: ");
		long n = scan.nextLong();
		double calculatedPI = 2;
		for (double i = 1; i <= n; i++) {
			calculatedPI *= 4 * i * i / (2 * i - 1) / (2 * i + 1);
		}
		System.out.printf("calculatedPI = %f\nMath.PI = %f\n", calculatedPI, Math.PI);
	}
}