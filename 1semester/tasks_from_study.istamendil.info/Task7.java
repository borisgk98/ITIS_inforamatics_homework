import java.util.Scanner;
import java.lang.Math;
import java.math.*;

public class Task7 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.printf("Please, enter n: ");
		long n = scan.nextInt();
		double rez = 1;
		for (double i = 1; i < n; i++) {
			rez += (i % 2 == 0 ? 1 : -1) / (2 * i + 1) / (2 * i + 1);
		}
		System.out.println(rez);
	}
}