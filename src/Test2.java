
public class Test2 {
	public static void main(String[] args) {
		new A();
		new B();
	}
}

class A {
	int ai = 7;

	public A() {
		setI(20);
		System.out.println("i from A is " + ai);
	}

	public void setI(int li) {
		ai = 2 * li;
	}
}

class B extends A {
	
	int bi = 15;
	
	public B() {
		super();
		System.out.println("i from B is " + bi);
		System.out.println("super.i from B is " + ai);
	}

	public void setI(int li) {
		bi = 3 * li;
	}
}
