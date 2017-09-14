import java.util.Scanner;
import java.math.*;

public class Task19 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt(), maxNumOf1 = 0, prefNum = 0, numOf1 = 0;
		while (a != 0) {
			if ((a & 1) == 1) {
				prefNum = 1;
				numOf1++;
				maxNumOf1 = (maxNumOf1 > numOf1 ? maxNumOf1 : numOf1);
			}
			else {
				numOf1 = 0;
			}
			a >>>= 1;
		}
		System.out.format("%d\n", maxNumOf1);
	}
}