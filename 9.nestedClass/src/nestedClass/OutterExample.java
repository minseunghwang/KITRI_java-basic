package nestedClass;

public class OutterExample {
	public static void main(String[] args) {
		Outter out = new Outter();		// Outter 내부에 있는 NestedClass를 사용하고 싶으면, 외부의 Outter를 먼저 객체화 시켜야 한다.
		out.runNestedClass();
		
		Outter.NestedClass nested = out.new NestedClass();
		nested.nestedMethod();
		System.out.println(nested.nested);
	}	
}
