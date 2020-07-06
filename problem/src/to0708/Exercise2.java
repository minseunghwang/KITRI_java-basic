package to0708;

class Outer {
	class Inner{
		int iv = 100;
	}
}

class Exercise2{
	public static void main(String[] args) {
		Outer outer = new Outer();
		Outer.Inner inner = outer.new Inner();
		System.out.println(inner.iv);
	}
}