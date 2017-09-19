import java.lang.String;
import java.math.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.*;

public class Task12 {
	public static void main(String Args[]) {
		try {
			if (Args.length < 1) {
				System.err.println("Not enought arguments");
				System.exit(1);		
			}
			int n = Integer.parseInt(Args[0]);
			int format_k = 1, nn = n * n;
			while (nn != 0) {
				format_k++;
				nn /= 10;
			}
			for (int i = 0; i < format_k; i++) {
				System.out.print(' ');
			}
			for (int i = 1; i <= n; i++) {
				System.out.print(format(i, format_k));
			}
			System.out.print('\n');
			for (int i = 1; i <= n; i++) {
				System.out.print(format(i, format_k));
				for (int j = 1; j <= n; j++) {
					System.out.print(format(i * j, format_k));
				}
				System.out.print('\n');
			}
			System.exit(0);
		}
		catch (java.lang.NumberFormatException exc) {
			System.err.println("Bad arguments");
			System.exit(1);
		}
		finally {
			System.err.println("Unknown error");
			System.exit(1);
		}
	}

	private static char[] format(int a, int k) {
		char[] charr = new char[k];
		for (int i = 0; i < k; i++) {
			charr[i] = ' ';		
		}
		int poz = k - 1;
		while (a != 0 && poz >= 0) {
			charr[poz] = (char)(a%10 + '0');
			a /= 10;
			poz--;
		}
		return charr;
	}
}