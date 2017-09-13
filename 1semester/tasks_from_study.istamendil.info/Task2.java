import java.util.Scanner;
import java.lang.Math;

public class Task2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.printf("Please, enter radius: ");
		double radius = scan.nextDouble();
		System.out.printf("Circule length: %f\nCircule square: %f\n", radius * Math.PI * 2,
		 radius * radius * Math.PI);
	}
}