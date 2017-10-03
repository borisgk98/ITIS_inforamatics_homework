import java.lang.Math;

public class Task22 {
	public static void main(String[] args) {
		try {
			long x = Long.parseLong(args[0]), y = Long.parseLong(args[1]);
			if (x > y) {
				long c = x;
				x = y;
				y = c;
			}

			//simple algorithm
			long timer1 = System.nanoTime();
			long gcd1 = 1;
			for (long i = x; i >= 2; i--) {
				if (x % i == 0 && y % i == 0) {
					gcd1 = i;
					break;
				}
			}

			//euclid algorithm
			long timer2 = System.nanoTime();
			while (x != 0) {
				y %= x;
				long c = x;
				x = y;
				y = c;
			}
			
			long timer3 = System.nanoTime();
			System.out.format("GCD(A, B) = %d\nTime1 (mc): %f\nTime2 (mc): %f\n",
											y, (double)(timer2 - timer1) / 1000, (double)(timer3 - timer2) / 1000);
			System.exit(0);
		}
		catch (java.lang.ArrayIndexOutOfBoundsException exc) {
			System.err.println("Not enought arguments");
			System.exit(1);			
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
}