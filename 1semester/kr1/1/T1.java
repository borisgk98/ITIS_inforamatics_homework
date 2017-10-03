import java.lang.Math;

class T1 {
	public static void main(String[] args) {
		if (args.length < 2) {
			System.err.println("Bad args");
			System.exit(1);
		}
		double y = Double.parseDouble(args[0]), x = Double.parseDouble(args[1]);
		final double eps = 1e-9;
		if (y - Math.sin(x) / x < eps) {
			System.out.println("Point on plot");
		}
		else {
			System.out.println("Point out of plot");
		}
	}
}