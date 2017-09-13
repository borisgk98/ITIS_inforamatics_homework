import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.printf("Please, enter the time of fall of a stone into the well: ");
		double timeOfFall = scan.nextDouble();
		System.out.printf("Depth of the well: %fm\n", timeOfFall * timeOfFall * 0.5);
	}
}