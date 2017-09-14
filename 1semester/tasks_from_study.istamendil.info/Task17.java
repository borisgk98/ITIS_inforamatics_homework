import java.util.Scanner;
import java.math.*;

public class Task17 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt(), k = scan.nextInt();
		String rez = "";
		long sum = 0;
		while(a != 0) {
			int p = a % k;
			rez += (char)(p > 9 ? p + 'A' - 10 : p + '0');
			sum += p;
			a /= k;
		}
		System.out.println(new StringBuffer(rez).reverse());
		System.out.println(sum);
	}
}