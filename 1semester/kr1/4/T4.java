import java.lang.Math;

class T4 {
	public static void main(String[] args) {
		if (args.length < 2) {
			System.err.println("Bad args");
			System.exit(1);
		}
		int n = Integer.parseInt(args[0]), m = Integer.parseInt(args[1]);
		for (int y = m; y >= 0; y--) {
			for (int x = 0; x <= n; x++) {
				if (y == Math.round(Math.sin(x)) + 10) {
					System.out.print('*');
				}
				else {
					System.out.print(' ');
				}
			}
			System.out.println();
		}
	}
}