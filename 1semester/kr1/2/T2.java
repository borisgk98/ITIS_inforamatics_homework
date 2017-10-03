class T2 {
	public static void main(String[] args) {
		if (args.length < 1 || args[0].length() != 6) {
			System.err.println("Bad args");
			System.exit(1);
		}
		int s1 = 0, s2 = 0;
		for (int i = 0; i < 6; i++) {
			char ch = args[0].charAt(i);
			if (ch < '0' || ch > '9') {
				System.err.println("Bad args");
				System.exit(1);
			}
			if (i < 3) {
				s1 += ch - '0';
			}
			else {
				s2 += ch - '0';
			}
		}
		if (s1 != s2) {
			System.out.println("Not a lucky ticket");
		}
		else {
			System.out.println("A lucky ticket");
		}
	}
}