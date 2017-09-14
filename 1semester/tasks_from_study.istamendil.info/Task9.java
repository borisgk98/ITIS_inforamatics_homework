import java.util.Scanner;
import java.math.*;

public class Task9 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double x = scan.nextDouble(),
		 y = scan.nextDouble(), 
		 r = scan.nextDouble(), 
		 a = scan.nextDouble(),
		 b = scan.nextDouble();
		final double eps = 0.1e-6;
		System.out.println(sqr(x - a) + sqr(y - b) - sqr(r) < eps ? 
			"On the circle" : 
			"Outside the circle");
	}

	static double sqr(double a) {
		return a * a;
	}
}