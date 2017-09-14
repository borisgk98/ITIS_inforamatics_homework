import java.util.*;
import java.lang.*;

try {
	public class Task21 {
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			int a = scan.nextInt(), b = scan.nextInt();
			System.out.println(lcd(a, b));
		}

		static int lcd(int a, int b) {
			return a / gcd(a, b) * b;
		}

		static int gcd(int a, int b) {
			while (b != 0) {
				a %= b;
				int c = a;
				a = b;
				b = c;
			}
			return a;
		}
	}
}