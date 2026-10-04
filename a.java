package demo;

public class a {
	int x;
	int y;
	static int z = 100;
	static {

		System.out.println("hello static block");
	}

	a() {
		System.out.println("constructor");
	}

	void m1() {
		System.out.println("m1");
	}

	static void m2() {
		System.out.println("m2");
	}
}
