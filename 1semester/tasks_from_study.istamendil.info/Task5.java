import java.util.Scanner;
import java.lang.Math;

public class Task5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.format("Enter n: ");
		int n = scan.nextInt();
		System.out.format("Enter x: ");
		double x = scan.nextDouble();
		double dp[] = new double[n];
		dp[0] = x / ((double)(n) + 1);
		for (int i = 1; i < n; i++) {
			dp[i] = x / ((double)(n - i + 1) + dp[i-1]);
		}
		System.out.format("Result: %f\n", dp[n-1] + 1);
	}
}