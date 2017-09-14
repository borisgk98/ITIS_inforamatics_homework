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
			long timer1 = System.currentTimeMillis();
			long gcd1 = 1;
			for (long i = x; i >= 2; i--) {
				if (x % i == 0 && y % i == 0) {
					gcd1 = i;
					break;
				}
			}

			//euclid algorithm
			long timer2 = System.currentTimeMillis();
			while (x != 0) {
				y %= x;
				long c = x;
				x = y;
				y = c;
			}
			
			long timer3 = System.currentTimeMillis();
			System.out.format("GCD(A, B) = %d\nTime1 (mc): %d\nTime2 (mc): %d\n",
											y, timer2, timer3);
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