import java.util.*;
import java.lang.*;

public class Task25 {
	public static void main(String[] args) {
		try {
			int n = 100;
			int[] v = new int[n];
			//final Random randGen = new Random();
			for (int i = 0; i < n; i++) {
				//v[i] = randGen.nextInt() % 100;
				v[i] = myRand(i) % 100;
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

	static int myRand(int n) {
		return (n * (1_000_000_000 + 7) % 52379 + 1_000_000_000 + 9) % 2398239;
	}
}