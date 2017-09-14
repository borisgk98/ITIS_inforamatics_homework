import java.util.Scanner;
import java.math.*;

public class Task14 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		BigInteger n = new BigInteger(scan.next()), rez = BigInteger.ONE;
		while (n.compareTo(BigInteger.ONE) != 0) {
			rez = rez.multiply(n);
			n = n.subtract(BigInteger.ONE);
		}
		System.out.println(rez);
	}
}