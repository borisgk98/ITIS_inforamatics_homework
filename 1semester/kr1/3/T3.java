import java.lang.Math;

class T3 {
	public static void main(String[] args) {
		if (args.length < 2) {
			System.err.println("Bad args");
			System.exit(1);
		}
		int n = Integer.parseInt(args[0]);
		double x = Double.parseDouble(args[1]);
		double rez = 1 / x;
		for (int i = 0; i < n; i++) {
			rez = 1 / (x + rez);
		}
		System.out.printf("S" + n + " = %.6f", rez + 1);
	}
}