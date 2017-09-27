import java.util.*;
import java.lang.*;

public class Task25 {
	public static void main(String[] args) {
		try {
			int n = 100;
			int[] v = new int[n];
			final Random randGen = new Random(System.currentTimeMillis());
			for (int i = 0; i < n; i++) {
				v[i] = randGen.nextInt() % 100;
			}
			for (int i = 0; i < n - 1; i++) {
				for (int j = i + 1; j < n; j++) {
					if (v[i] > v[j]) {
						int c = v[i];
						v[i] = v[j];
						v[j] = v[i];
					}
				}
			}
			for (int el : v) {
				System.out.print(el + " ");
			}
			System.exit(0);
		}
		finally {
			System.err.println("Unknown error");
			System.exit(1);
		}
	}
}