package chapter06;

public class AmbiguousOverloading {
	public static void main(String[] args) {
		System.out.println(max(1, 2));
	}
	
/*
	public static double max(int num1, int num2) { // 100 + 100
		if (num1 > num2)
			return num1;
		else
			return num2;
	}
*/
	
	public static double max(int num1, double num2) { // 100 + 50
		if (num1 > num2)
			return num1;
		else
			return num2;
	}

	public static double max(double num1, int num2) { // 50 + 100
		if (num1 > num2)
			return num1;
		else
			return num2;
	}
	
	public static double max(double num1, double num2) { // 50 + 50
		if (num1 > num2)
			return num1;
		else
			return num2;
	}
}