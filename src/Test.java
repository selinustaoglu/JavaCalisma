public class Test {
	public static void main(String[] args) {
		System.out.println(1 - 0.9);
		// xMethod(1234567);
	}

	public static void xMethod(double n) {
		if (n != 0) {
			System.out.println(n);
			xMethod(n / 10);
			System.out.println(n);
		}
	}
}