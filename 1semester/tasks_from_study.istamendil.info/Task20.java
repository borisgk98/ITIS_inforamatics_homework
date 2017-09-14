import java.util.*;
import java.lang.*;

public class Task20 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for (int i = 1; i <= (int)(Math.sqrt((double)(n)) + 0.5); i++) {
			if (n % i == 0) {
				System.out.printf("%d %d ", i, n / i);
			}
		}
	}
}