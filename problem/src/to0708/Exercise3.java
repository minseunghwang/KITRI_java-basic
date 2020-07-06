package to0708;

public class Exercise3 {
	public static void main(String[] args) {
		Outer1.Inner inner = new Outer1.Inner();
		System.out.println(inner.iv);
	}
}

class Outer1{
	static class Inner{
		int iv = 200;
	}
}