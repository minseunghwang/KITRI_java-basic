package staticExample;

public class ClassExample {
	int a = 10;
	static int b = 10;

	void method() {
		a = 20;
		System.out.println(b);
		b = 30;
		System.out.println(a);
	}

	static void staticMethod() {
//		this.a = 20;
//		b = 20;
		System.out.println(b);
	}

	public static void main(String args[]) {
		ClassExample.staticMethod();
	}
}
