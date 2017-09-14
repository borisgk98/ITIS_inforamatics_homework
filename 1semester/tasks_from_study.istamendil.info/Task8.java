import java.util.Scanner;
import java.math.*;

public class Task8 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		double x = scan.nextDouble();
		double rez = Math.cos(x);
		for (int i = 1; i < n; i++) {
			rez = Math.cos(x + rez);
		}
		System.out.format("%f\n", rez);
	}
}