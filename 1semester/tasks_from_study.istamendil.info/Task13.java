import java.util.Scanner;
import java.math.*;

public class Task13 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt(), y = scan.nextInt();
		x *= y;
		y = x / y;
		x = x / y;
		System.out.format("%d %d\n", x, y);
	}
}