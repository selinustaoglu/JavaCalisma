package bolum07;

public class StackTasmasiKacSeferdeOlur {

	public static void main(String[] args) {
		foo(1);
	}
	
	
	public static void foo(int i) {
		long l1 = 6;
		long l2 = 6;
		long l3 = 6;
		System.out.println(i);
		foo(i + 1);
	}

}
