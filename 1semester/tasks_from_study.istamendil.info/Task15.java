import java.util.Scanner;
import java.math.*;

public class Task15 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a1 = scan.nextInt(), a2 = scan.nextInt(), k = scan.nextInt();
		System.out.println(a1 + (k - 1) * (a2 - a1));
	}
}